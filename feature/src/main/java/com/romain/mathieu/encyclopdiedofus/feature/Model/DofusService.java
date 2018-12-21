package com.romain.mathieu.encyclopdiedofus.feature.Model;

import com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus.EquipementDofus;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface DofusService {

    MyConstant constant = new MyConstant();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://dofapis.herokuapp.com/api/equipments/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();

    @GET("equipments")
    Observable<EquipementDofus> getItemDofus();
}
