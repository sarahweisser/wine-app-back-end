package com.weisser.sarah.wineapp.model.wine;

public class Varietal {

    private String varietalName;
    private String skinColor;
    private boolean isTeinturier;

    public String getVarietalName() {
        return varietalName;
    }

    public void setVarietalName(String varietalName) {
        this.varietalName = varietalName;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public boolean isTeinturier() {
        return isTeinturier;
    }

    public void setisTeinturier(boolean isTeinturier) {
        this.isTeinturier = isTeinturier;
    }

}
