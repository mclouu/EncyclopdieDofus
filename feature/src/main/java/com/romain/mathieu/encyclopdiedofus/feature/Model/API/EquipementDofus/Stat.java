
package com.romain.mathieu.encyclopdiedofus.feature.Model.API.EquipementDofus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stat {

    @SerializedName("Vitalit\u00e9")
    @Expose
    private Vitalit vitalit;
    @SerializedName("Intelligence")
    @Expose
    private Intelligence intelligence;
    @SerializedName("Agilit\u00e9")
    @Expose
    private Agilit agilit;
    @SerializedName("Sagesse")
    @Expose
    private Sagesse sagesse;
    @SerializedName("PA")
    @Expose
    private PA pA;
    @SerializedName("Prospection")
    @Expose
    private Prospection prospection;
    @SerializedName("Dommages Feu")
    @Expose
    private DommagesFeu dommagesFeu;
    @SerializedName("Dommages Air")
    @Expose
    private DommagesAir dommagesAir;
    @SerializedName("% R\u00e9sistance Neutre")
    @Expose
    private RSistanceNeutre rSistanceNeutre;
    @SerializedName("% R\u00e9sistance Feu")
    @Expose
    private RSistanceFeu rSistanceFeu;
    @SerializedName("R\u00e9sistance Critiques")
    @Expose
    private RSistanceCritiques rSistanceCritiques;

    public Vitalit getVitalit() {
        return vitalit;
    }

    public void setVitalit(Vitalit vitalit) {
        this.vitalit = vitalit;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public Agilit getAgilit() {
        return agilit;
    }

    public void setAgilit(Agilit agilit) {
        this.agilit = agilit;
    }

    public Sagesse getSagesse() {
        return sagesse;
    }

    public void setSagesse(Sagesse sagesse) {
        this.sagesse = sagesse;
    }

    public PA getPA() {
        return pA;
    }

    public void setPA(PA pA) {
        this.pA = pA;
    }

    public Prospection getProspection() {
        return prospection;
    }

    public void setProspection(Prospection prospection) {
        this.prospection = prospection;
    }

    public DommagesFeu getDommagesFeu() {
        return dommagesFeu;
    }

    public void setDommagesFeu(DommagesFeu dommagesFeu) {
        this.dommagesFeu = dommagesFeu;
    }

    public DommagesAir getDommagesAir() {
        return dommagesAir;
    }

    public void setDommagesAir(DommagesAir dommagesAir) {
        this.dommagesAir = dommagesAir;
    }

    public RSistanceNeutre getRSistanceNeutre() {
        return rSistanceNeutre;
    }

    public void setRSistanceNeutre(RSistanceNeutre rSistanceNeutre) {
        this.rSistanceNeutre = rSistanceNeutre;
    }

    public RSistanceFeu getRSistanceFeu() {
        return rSistanceFeu;
    }

    public void setRSistanceFeu(RSistanceFeu rSistanceFeu) {
        this.rSistanceFeu = rSistanceFeu;
    }

    public RSistanceCritiques getRSistanceCritiques() {
        return rSistanceCritiques;
    }

    public void setRSistanceCritiques(RSistanceCritiques rSistanceCritiques) {
        this.rSistanceCritiques = rSistanceCritiques;
    }

}
