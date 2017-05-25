package samir.appsghor.com.mvppracticalexample.dependencyInjection.component;

import android.content.Context;

import dagger.Component;
import retrofit2.Retrofit;
import samir.appsghor.com.mvppracticalexample.Modules.MainActivity;
import samir.appsghor.com.mvppracticalexample.dependencyInjection.module.CakeModule;
import samir.appsghor.com.mvppracticalexample.dependencyInjection.scopes.PerActivity;

/**
 * Created by samir on 5/25/2017.
 */

@PerActivity
@Component(modules = CakeModule.class, dependencies = ApplicationComponent.class)
public interface CackComponent {

   // Retrofit exposeRetrofit();

   // Context exposeContext();

    void inject(MainActivity mainActivity);
}
