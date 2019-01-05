package com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus;

import com.google.gson.annotations.SerializedName;


public class Initiative{

	@SerializedName("from")
	private String from;

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}
}