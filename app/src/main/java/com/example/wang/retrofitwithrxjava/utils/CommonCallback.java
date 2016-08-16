package com.example.wang.retrofitwithrxjava.utils;

/**
 * 通用回调接口
 * Created by wang on 2016/8/15.
 */
public abstract class CommonCallback<T> {

    public abstract void onSuccess(T result);

    public abstract void onFailure(Throwable t);

    public void whatever() {
    }
}