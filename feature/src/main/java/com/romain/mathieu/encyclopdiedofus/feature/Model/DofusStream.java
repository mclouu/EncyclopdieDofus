package com.romain.mathieu.encyclopdiedofus.feature.Model;

import com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus.EquipementDofus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DofusStream {

    public static Observable<List<EquipementDofus>> streamFetchItem() {
        DofusService dofusService = DofusService.retrofit.create(DofusService.class);
        return dofusService.getItemDofus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }


}
