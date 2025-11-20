package com.nukkadshops.mark03.network;

import com.nukkadshops.mark03.sdk.PaymentConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;
import java.util.concurrent.TimeUnit;

public class ApiClient {

    public static Retrofit getClient(PaymentConfig config) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .connectTimeout(config.getTimeoutInSeconds(), TimeUnit.SECONDS)
                .readTimeout(config.getTimeoutInSeconds(), TimeUnit.SECONDS)
                .build();

        return new Retrofit.Builder()
                .baseUrl(config.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
}
