package com.example.wang.retrofitwithrxjava.utils;

import android.content.Context;
import android.util.Log;

import com.example.wang.retrofitwithrxjava.bean.BaseBean;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by wang on 2016/8/15 0015.
 */
public class PackageCommonCall {


    public static <T> CommonCall<T> fromObservable(final Observable<BaseBean<T>> observable, final Context context) {
        return new CommonCall<T>() {
            private Subscription subscription;

            @Override
            public T execute() throws Throwable {
                return null;
            }

            @Override
            public void enqueue(final CommonCallback<T> callback) {
                if (subscription != null) {
                    subscription.unsubscribe();
                }

                /** 接口回调 封装操作*/
                subscription = PackageRequest.packageRetrofit(observable, context).subscribe(new Action1<T>() {
                    @Override
                    public void call(T t) {
                        /** 数据加载成功 执行回调操作*/
                        Log.i("info", "CommonCall next");
                        callback.onSuccess(t);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        /** 错误 */
                        Log.i("info", "CommonCall error");
                    }
                }, new Action0() {
                    @Override
                    public void call() {
                        /** 数据加载完成*/
                        Log.i("info", "CommonCall complete");
                    }
                });
            }

            @Override
            public void cancel() {
                if (subscription != null) subscription.unsubscribe();
            }
        };
    }
}
