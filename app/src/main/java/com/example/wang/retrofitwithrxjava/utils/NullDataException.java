package com.example.wang.retrofitwithrxjava.utils;

import android.util.Log;

/**
 * Created by wang on 2016/8/15 0015.
 */
public class NullDataException extends Exception {

    public NullDataException() {
    }

    public NullDataException(String detailMessage) {
        super(detailMessage);
        Log.i("info","数据为空");
    }

    public NullDataException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
