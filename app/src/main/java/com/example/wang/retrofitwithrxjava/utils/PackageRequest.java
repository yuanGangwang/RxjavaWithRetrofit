package com.example.wang.retrofitwithrxjava.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.wang.retrofitwithrxjava.bean.BaseBean;

import java.net.UnknownHostException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by wang on 2016/8/15 0015.
 */
public class PackageRequest {

    public static <T> Observable<T> packageRetrofit(final Observable<BaseBean<T>> call, final Context context) {
        Log.i("info", "ok");

        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<BaseBean<T>, Observable<T>>() {
                    @Override
                    public Observable<T> call(BaseBean<T> responseBenBaseBean) {
                        Log.i("info", "packageRetrofit next");
                        /** 模拟数据过滤 */
                        if (responseBenBaseBean.getSubjects() != null) {
                            return Observable.from(responseBenBaseBean.getSubjects());
                        }
                        return Observable.error(new NullDataException("暂无数据"));
                    }
                }, new Func1<Throwable, Observable<T>>() {
                    @Override
                    public Observable<T> call(Throwable throwable) {
                        /** 异常的封装*/
                        Log.i("info", "packageRetrofit error");
                        if (throwable instanceof UnknownHostException) {
                            /** 如果当前没有网络的情况下*/
                            Toast.makeText(context, "网络异常", Toast.LENGTH_SHORT).show();
                        }
                        return Observable.error(throwable);
                    }
                }, new Func0<Observable<T>>() {
                    @Override
                    public Observable<T> call() {
                        /** 数据筛选完成*/
                        Log.i("info", "packageRetrofit complete");
                        return Observable.empty();
                    }
                });


    }
}
