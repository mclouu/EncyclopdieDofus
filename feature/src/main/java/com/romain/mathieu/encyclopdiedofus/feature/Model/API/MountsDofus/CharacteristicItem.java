package com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus;

import com.google.gson.annotations.SerializedName;


public class CharacteristicItem{

	@SerializedName("Capturable")
	private String capturable;

	@SerializedName("Taux d'apprentisage")
	private String tauxDApprentisage;

	@SerializedName("Vitesse de d�placement")
	private String vitesseDeDPlacement;

	@SerializedName("Vitesse")
	private String vitesse;

	@SerializedName("Energie")
	private String energie;

	@SerializedName("Maturit�")
	private String maturit;

	@SerializedName("Temps de gestation")
	private String tempsDeGestation;

	@SerializedName("Nombre de pods")
	private String nombreDePods;

	@SerializedName("G�n�ration")
	private String gNRation;

	public void setCapturable(String capturable){
		this.capturable = capturable;
	}

	public String getCapturable(){
		return capturable;
	}

	public void setTauxDApprentisage(String tauxDApprentisage){
		this.tauxDApprentisage = tauxDApprentisage;
	}

	public String getTauxDApprentisage(){
		return tauxDApprentisage;
	}

	public void setVitesseDeDPlacement(String vitesseDeDPlacement){
		this.vitesseDeDPlacement = vitesseDeDPlacement;
	}

	public String getVitesseDeDPlacement(){
		return vitesseDeDPlacement;
	}

	public void setVitesse(String vitesse){
		this.vitesse = vitesse;
	}

	public String getVitesse(){
		return vitesse;
	}

	public void setEnergie(String energie){
		this.energie = energie;
	}

	public String getEnergie(){
		return energie;
	}

	public void setMaturit(String maturit){
		this.maturit = maturit;
	}

	public String getMaturit(){
		return maturit;
	}

	public void setTempsDeGestation(String tempsDeGestation){
		this.tempsDeGestation = tempsDeGestation;
	}

	public String getTempsDeGestation(){
		return tempsDeGestation;
	}

	public void setNombreDePods(String nombreDePods){
		this.nombreDePods = nombreDePods;
	}

	public String getNombreDePods(){
		return nombreDePods;
	}

	public void setGNRation(String gNRation){
		this.gNRation = gNRation;
	}

	public String getGNRation(){
		return gNRation;
	}
}