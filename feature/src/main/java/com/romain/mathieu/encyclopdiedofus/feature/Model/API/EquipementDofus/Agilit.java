
package com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Agilit {

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

}
