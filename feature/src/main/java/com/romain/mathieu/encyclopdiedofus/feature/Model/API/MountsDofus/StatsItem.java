package com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus;

import com.google.gson.annotations.SerializedName;

public class StatsItem{

	@SerializedName("Invocations")
	private Invocations invocations;

	@SerializedName("Vitalit�")
	private Vitalit vitalit;

	@SerializedName("Agilit�")
	private Agilit agilit;

	@SerializedName("Initiative")
	private Initiative initiative;

	public void setInvocations(Invocations invocations){
		this.invocations = invocations;
	}

	public Invocations getInvocations(){
		return invocations;
	}

	public void setVitalit(Vitalit vitalit){
		this.vitalit = vitalit;
	}

	public Vitalit getVitalit(){
		return vitalit;
	}

	public void setAgilit(Agilit agilit){
		this.agilit = agilit;
	}

	public Agilit getAgilit(){
		return agilit;
	}

	public void setInitiative(Initiative initiative){
		this.initiative = initiative;
	}

	public Initiative getInitiative(){
		return initiative;
	}
}