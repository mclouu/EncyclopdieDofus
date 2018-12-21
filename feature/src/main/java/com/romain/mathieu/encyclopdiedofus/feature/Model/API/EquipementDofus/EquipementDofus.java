
package com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EquipementDofus {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("lvl")
    @Expose
    private Integer lvl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("imgUrl")
    @Expose
    private String imgUrl;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("set")
    @Expose
    private Integer set;
    @SerializedName("condition")
    @Expose
    private List<Object> condition = null;
    @SerializedName("stats")
    @Expose
    private List<Stat> stats = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public List<Object> getCondition() {
        return condition;
    }

    public void setCondition(List<Object> condition) {
        this.condition = condition;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

}
