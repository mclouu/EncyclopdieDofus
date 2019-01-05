package com.romain.mathieu.encyclopdiedofus.feature.Model.API.PetsDofus;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PetsDofus {

    @SerializedName("imgUrl")
    private String imgUrl;

    @SerializedName("condition")
    private List<Object> condition;

    @SerializedName("lvl")
    private int lvl;

    @SerializedName("stats")
    private List<StatsItem> stats;

    @SerializedName("__v")
    private int V;

    @SerializedName("maxstats")
    private List<String> maxstats;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("_id")
    private int id;

    @SerializedName("type")
    private String type;

    @SerializedName("url")
    private String url;

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setCondition(List<Object> condition) {
        this.condition = condition;
    }

    public List<Object> getCondition() {
        return condition;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    public void setStats(List<StatsItem> stats) {
        this.stats = stats;
    }

    public List<StatsItem> getStats() {
        return stats;
    }

    public void setV(int V) {
        this.V = V;
    }

    public int getV() {
        return V;
    }

    public void setMaxstats(List<String> maxstats) {
        this.maxstats = maxstats;
    }

    public List<String> getMaxstats() {
        return maxstats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}