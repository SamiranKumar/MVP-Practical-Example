package samir.appsghor.com.mvppracticalexample.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by samir on 5/25/2017.
 */

/***
 * BaseActivity abstract class is parent class of all activity class
 */
public abstract class BaseActivity extends AppCompatActivity {
    private ProgressDialog mProgressDialog;






    /*@Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getContentView());

        onViewReady(savedInstanceState, getIntent());
    }

    protected abstract int getContentView();

    *//**
     * To Used by child Activities class
     *
     * @param savedInstanceState
     * @param intent
     *//*
    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        resolveDaggerDependency();


    }

    protected void resolveDaggerDependency() {

    }*/

    protected void showDialog(String message) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setCancelable(true);
        }
        mProgressDialog.setMessage(message);
        mProgressDialog.show();

    }

    protected void hideDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }

    }
}
