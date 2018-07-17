package com.example.demo.utils;

import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * OkHttp工具集
 *
 * @author pangbh
 * @version 1.0
 */
public class OkHttpClientUtils {
    private static final Logger logger = LoggerFactory.getLogger(OkHttpClientUtils.class);
    private static OkHttpClient okHttpClient;


    public static synchronized OkHttpClient getLoggingClient() {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                    .readTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                    .writeTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                    .build();
        }
        return okHttpClient;
    }

}
