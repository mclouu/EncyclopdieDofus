package com.romain.mathieu.encyclopdiedofus.feature.Model;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus.EquipementDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus.MountsDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.PetsDofus.PetsDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.WeaponsDofus.WeaponsDofus;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface DofusService {

    MyConstant constant = new MyConstant();

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addNetworkInterceptor(new StethoInterceptor())
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(constant.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();



    @GET("equipments/")
    Observable<List<EquipementDofus>> getItemDofus();

    @GET("Weapons/")
    Observable<List<WeaponsDofus>> getWeaponsDofus();

    @GET("Pets/")
    Observable<List<PetsDofus>> getPetsDofus();

    @GET("Mounts/")
    Observable<List<MountsDofus>> getMountsDofus();
}
