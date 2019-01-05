package com.romain.mathieu.encyclopdiedofus.feature.Model;

import com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus.EquipementDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus.MountsDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.PetsDofus.PetsDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.API.WeaponsDofus.WeaponsDofus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DofusStream {

    public static Observable<List<EquipementDofus>> streamFetchEquipement() {
        DofusService dofusService = DofusService.retrofit.create(DofusService.class);
        return dofusService.getItemDofus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public static Observable<List<WeaponsDofus>> streamFetchWeapons() {
        DofusService dofusService = DofusService.retrofit.create(DofusService.class);
        return dofusService.getWeaponsDofus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public static Observable<List<PetsDofus>> streamFetchPets() {
        DofusService dofusService = DofusService.retrofit.create(DofusService.class);
        return dofusService.getPetsDofus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public static Observable<List<MountsDofus>> streamFetchMounts() {
        DofusService dofusService = DofusService.retrofit.create(DofusService.class);
        return dofusService.getMountsDofus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }
}