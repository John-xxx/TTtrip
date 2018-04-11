package ownhome.top.tttrip.retrofit;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import ownhome.top.tttrip.action.Api;
import ownhome.top.tttrip.config.HttpConfig;
import ownhome.top.tttrip.utils.InterceptorUtil;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static ownhome.top.tttrip.retrofit.RetrofitFactory.RetrofitFactoryInner.retrofitFactoryInstance;

/**
 * date：2018/4/11 11:43
 * author：M.Qtrip
 * email：475934874@qq.com
 * description：
 */
public class RetrofitFactory {
    private static Api api;

    private RetrofitFactory() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(HttpConfig.HTTP_TIME, TimeUnit.SECONDS)
                .readTimeout(HttpConfig.HTTP_TIME, TimeUnit.SECONDS)
                .writeTimeout(HttpConfig.HTTP_TIME, TimeUnit.SECONDS)
                .addInterceptor(InterceptorUtil.HeaderInterceptor())
                .addInterceptor(InterceptorUtil.LoggingInterceptor())
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HttpConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        api = retrofit.create(Api.class);
    }

    //单列
    public static RetrofitFactory getInstance() {
        return retrofitFactoryInstance;
    }

    static class RetrofitFactoryInner {
        static RetrofitFactory retrofitFactoryInstance = new RetrofitFactory();
    }

    public Api api() {
        return api;
    }
}
