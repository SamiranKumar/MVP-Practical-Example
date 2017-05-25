package samir.appsghor.com.mvppracticalexample.Modules;



import android.content.Intent;
import android.os.Bundle;

import javax.inject.Inject;

import samir.appsghor.com.mvppracticalexample.R;
import samir.appsghor.com.mvppracticalexample.base.BaseActivity;
import samir.appsghor.com.mvppracticalexample.mvp.presenter.CakePresanter;
import samir.appsghor.com.mvppracticalexample.mvp.view.IMainView;

public class MainActivity extends BaseActivity implements IMainView{

    @Inject protected CakePresanter mCakePresanter;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);

        mCakePresanter.getCake();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void resolveDaggerDependency() {
        super.resolveDaggerDependency();
    }
}
