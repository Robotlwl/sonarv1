package com.example.demo.utils;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * 创建retrofit的工厂
 *
 * @author pangbh
 * @version 1.0
 */
public class RetrofitFactory {

    public static Retrofit getRetrofit(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(OkHttpClientUtils.getLoggingClient())
                .addConverterFactory(GsonConverterFactory.create())  //定义了一个规则，传入传出的数据都是以json格式
                .build();
    }
}
