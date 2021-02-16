package com.weisser.sarah.wineapp.model.wine;

import com.weisser.sarah.wineapp.model.shared.AcidityLevel;
import com.weisser.sarah.wineapp.model.shared.SweetnessLevel;

public class WineFlavorProfile {

    private WineBody wineBody;
    private SweetnessLevel sweetnessLevel;
    private AcidityLevel acidityLevel;
    private boolean needsAging;
    private boolean pairWithFood;

    public WineBody getWineBody() {
        return wineBody;
    }

    public void setWineBody(WineBody wineBody) {
        this.wineBody = wineBody;
    }

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

    public boolean isNeedsAging() {
        return needsAging;
    }

    public void setNeedsAging(boolean needsAging) {
        this.needsAging = needsAging;
    }

    public boolean isPairWithFood() {
        return pairWithFood;
    }

    public void setPairWithFood(boolean pairWithFood) {
        this.pairWithFood = pairWithFood;
    }
}
