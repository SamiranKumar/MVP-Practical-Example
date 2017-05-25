package samir.appsghor.com.mvppracticalexample.application;

import android.app.Application;

import samir.appsghor.com.mvppracticalexample.dependencyInjection.component.DaggerApplicationComponent;

/**
 * Created by samir on 5/25/2017.
 */

public class CakeApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void initializeApplicationComponent(){
        DaggerApplicationComponent.builder();
    }

}
