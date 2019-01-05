package com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MountsDofus{

	@SerializedName("imgUrl")
	private String imgUrl;

	@SerializedName("lvl")
	private int lvl;

	@SerializedName("stats")
	private List<StatsItem> stats;

	@SerializedName("__v")
	private int V;

	@SerializedName("name")
	private String name;

	@SerializedName("_id")
	private int id;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("characteristic")
	private List<CharacteristicItem> characteristic;

	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}

	public String getImgUrl(){
		return imgUrl;
	}

	public void setLvl(int lvl){
		this.lvl = lvl;
	}

	public int getLvl(){
		return lvl;
	}

	public void setStats(List<StatsItem> stats){
		this.stats = stats;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setCharacteristic(List<CharacteristicItem> characteristic){
		this.characteristic = characteristic;
	}

	public List<CharacteristicItem> getCharacteristic(){
		return characteristic;
	}
}