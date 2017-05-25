package samir.appsghor.com.mvppracticalexample.dependencyInjection.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import samir.appsghor.com.mvppracticalexample.api.CakeApiServices;
import samir.appsghor.com.mvppracticalexample.dependencyInjection.scopes.PerActivity;
import samir.appsghor.com.mvppracticalexample.mvp.view.IMainView;

/**
 * Created by samir on 5/25/2017.
 */

@Module
public class CakeModule {
    private IMainView mIMainView;

    public CakeModule(IMainView mIMainView) {
        this.mIMainView = mIMainView;

    }

    @PerActivity
    @Provides
    CakeApiServices provideCakeApiServices(Retrofit retrofit) {
        return retrofit.create(CakeApiServices.class);
    }

    @PerActivity
    @Provides
    IMainView provideIMainView( ) {
        return mIMainView;
    }
}
