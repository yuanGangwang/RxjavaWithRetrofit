package com.example.wang.retrofitwithrxjava;

import android.app.Application;

import com.example.wang.retrofitwithrxjava.utils.NetLink;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zx on 2016/8/15 0015.
 */
public class MyApp extends Application {

    private static MyApp myApp;
    private String path = "https://api.douban.com";
    private NetLink netLink;

    public static MyApp getMyApp() {
        return myApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.myApp = this;

        initRetrofit();
    }

    public NetLink getNetLink() {
        return netLink;
    }

    private void initRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        netLink = retrofit.create(NetLink.class);
    }

}
