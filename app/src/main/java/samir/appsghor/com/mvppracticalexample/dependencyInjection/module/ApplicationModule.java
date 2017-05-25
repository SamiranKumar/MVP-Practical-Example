package samir.appsghor.com.mvppracticalexample.dependencyInjection.module;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by samir on 5/25/2017.
 */

@Module
public class ApplicationModule {
    private String BASE_URL;//= "https://gist.githubusercontent.com";

    private Context mContext;

    public ApplicationModule(Context mContext, String BASE_URL) {
        this.mContext = mContext;
        this.BASE_URL = BASE_URL;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mContext;
    }

    @Singleton
    @Provides
    GsonConverterFactory providegsonGsonConverterFactory() {
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        return gsonConverterFactory;
    }

    @Singleton
    @Provides
    @Named("ok-1")
    OkHttpClient provideOkHttpClient1() {
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    @Named("ok-2")
    OkHttpClient provideOkHttpClient2() {
        return new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    RxJavaCallAdapterFactory provideRxJavaCallAdapterFactory() {
        return RxJavaCallAdapterFactory.create(); // create is static method.Donn't need new Instances
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory gsonConverterFactory, RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .client(client)
                .build();
    }

}
