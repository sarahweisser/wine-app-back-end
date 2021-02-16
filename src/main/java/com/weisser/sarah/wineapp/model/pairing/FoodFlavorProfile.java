package com.weisser.sarah.wineapp.model.pairing;

import com.weisser.sarah.wineapp.model.shared.AcidityLevel;
import com.weisser.sarah.wineapp.model.shared.SweetnessLevel;

import java.util.List;

public class FoodFlavorProfile {

    // this entity will contain flavors and characteristics of a dish to be paired with a wine
    // more than one dish (pairing) object can match one flavor profile

    private SweetnessLevel sweetnessLevel;
    private AcidityLevel acidityLevel;
    private boolean isSpicy;
    // TODO create ENUM for flavorDescriptors and textures
    private List<String> flavorDescriptors;
    private String texture;

    public SweetnessLevel getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(SweetnessLevel sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public AcidityLevel getAcidityLevel() {
        return acidityLevel;
    }

    public void setAcidityLevel(AcidityLevel acidityLevel) {
        this.acidityLevel = acidityLevel;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public List<String> getFlavorDescriptors() {
        return flavorDescriptors;
    }

    public void setFlavorDescriptors(List<String> flavorDescriptors) {
        this.flavorDescriptors = flavorDescriptors;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}

