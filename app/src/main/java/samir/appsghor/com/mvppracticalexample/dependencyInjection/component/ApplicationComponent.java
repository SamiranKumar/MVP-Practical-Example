package samir.appsghor.com.mvppracticalexample.dependencyInjection.component;

import javax.inject.Singleton;

import dagger.Component;
import samir.appsghor.com.mvppracticalexample.dependencyInjection.module.ApplicationModule;

/**
 * Created by samir on 5/25/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {


}
