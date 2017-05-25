package samir.appsghor.com.mvppracticalexample.base;


import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import samir.appsghor.com.mvppracticalexample.mvp.view.IBaseView;

/**
 * Created by samir on 5/25/2017.
 */

public class BasePresanter <V extends IBaseView>  {
    @Inject protected V mView;

    protected V getView(){
        return mView;
    }

    protected <T> void subscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.newThread())
                .toSingle()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }


}
