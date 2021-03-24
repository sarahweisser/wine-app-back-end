package com.weisser.sarah.wineapp.model.wine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Wine {

    // TODO add full list of attributes to this entity once database is set up

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // TODO decide if it makes sense to enforce uniqueness on wineryname column
    private String wineryName;
    private String wineName;
    // Non Vintage wines will have -1 for vintage
    private int vintage;
    private String appellation;
    private String description;
    private float starRating;

//    private WineColor wineColor;
//    private WineType wineType;
//    private List<Varietal> varietals;
//    private List<String> flavors;
//    private List<Pairing> parings;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWineryName() {
        return wineryName;
    }

    public void setWineryName(String wineryName) {
        this.wineryName = wineryName;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }
}
