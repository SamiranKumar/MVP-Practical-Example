package samir.appsghor.com.mvppracticalexample.api;

import android.database.Observable;

import retrofit2.Call;
import retrofit2.http.GET;
import samir.appsghor.com.mvppracticalexample.mvp.model.CakesResponse;


/**
 * Created by samir on 5/25/2017.
 */

public interface CakeApiServices {

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakesResponse> getCakesResponseObservable();

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Call<CakesResponse> getTheCacks();
}
