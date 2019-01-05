package com.romain.mathieu.encyclopdiedofus.feature.Model.API.PetsDofus;

import com.google.gson.annotations.SerializedName;


public class DommagesTerre {

    @SerializedName("from")
    private String from;

    @SerializedName("to")
    private String to;

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }
}