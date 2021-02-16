package com.weisser.sarah.wineapp.model.pairing;

public class Pairing {

    // this entity will represent a dish to be paired with a wine

    private String nameOfDish;
    private FoodFlavorProfile foodFlavorProfile;

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public FoodFlavorProfile getFoodFlavorProfile() {
        return foodFlavorProfile;
    }

    public void setFoodFlavorProfile(FoodFlavorProfile foodFlavorProfile) {
        this.foodFlavorProfile = foodFlavorProfile;
    }
}
