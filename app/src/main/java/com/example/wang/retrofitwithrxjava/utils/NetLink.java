package com.example.wang.retrofitwithrxjava.utils;

import com.example.wang.retrofitwithrxjava.bean.BaseBean;
import com.example.wang.retrofitwithrxjava.bean.ResponseBen;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wang on 2016/8/15 0015.
 */
public interface NetLink {
    @GET("/v2/movie/top250")
    Observable<BaseBean<ResponseBen>> getDataSec(@Query("start") int begin, @Query("count") int num);

    @GET("/v2/movie/top250")
    Observable<BaseBean<List<ResponseBen>>> getBetterDataSec(@Query("start") int begin, @Query("count") int num);

}
