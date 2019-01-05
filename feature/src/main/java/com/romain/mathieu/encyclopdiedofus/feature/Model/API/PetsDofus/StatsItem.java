package com.romain.mathieu.encyclopdiedofus.feature.Model.API.PetsDofus;

import com.google.gson.annotations.SerializedName;


public class StatsItem {

    @SerializedName("Dommages Terre")
    private DommagesTerre dommagesTerre;

    public void setDommagesTerre(DommagesTerre dommagesTerre) {
        this.dommagesTerre = dommagesTerre;
    }

    public DommagesTerre getDommagesTerre() {
        return dommagesTerre;
    }
}