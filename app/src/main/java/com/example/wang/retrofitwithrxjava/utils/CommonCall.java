package com.example.wang.retrofitwithrxjava.utils;

/**
 * 通用请求接口
 * Created by wang on 2016/8/15.
 */
public interface CommonCall<T> {

    /**
     * 同步执行
     *
     * @return
     */
    T execute() throws Throwable;

    /**
     * 异步回调
     *
     * @param callback
     */
    void enqueue(CommonCallback<T> callback);

    /**
     * 取消请求
     */
    void cancel();

}
