package com.romain.mathieu.encyclopdiedofus.feature.Model.API.WeaponsDofus;

import com.google.gson.annotations.SerializedName;


public class CharacteristicItem{

	@SerializedName("CC")
	private String cC;

	@SerializedName("Port�e")
	private String portE;

	@SerializedName("PA")
	private String pA;

	public void setCC(String cC){
		this.cC = cC;
	}

	public String getCC(){
		return cC;
	}

	public void setPortE(String portE){
		this.portE = portE;
	}

	public String getPortE(){
		return portE;
	}

	public void setPA(String pA){
		this.pA = pA;
	}

	public String getPA(){
		return pA;
	}
}