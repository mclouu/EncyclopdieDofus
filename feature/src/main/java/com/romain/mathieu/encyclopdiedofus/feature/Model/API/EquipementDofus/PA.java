
package com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PA {

    @SerializedName("from")
    @Expose
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
