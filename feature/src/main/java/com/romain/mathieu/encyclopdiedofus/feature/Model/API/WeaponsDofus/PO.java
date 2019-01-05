package com.romain.mathieu.encyclopdiedofus.feature.Model.API.WeaponsDofus;

import com.google.gson.annotations.SerializedName;


public class PO{

	@SerializedName("from")
	private String from;

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}
}