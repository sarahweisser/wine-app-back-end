package com.weisser.sarah.wineapp.model.wine;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Wine {

    // TODO add full list of attributes to this entity

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // TODO  rename attributes for name and recreate db table

    private String name;
    private BigDecimal purchasePrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date purchaseDate;
    private boolean red;
    //    private String wineryName;
//    private int vintage;

//    private WineColor wineColor;
//    private WineType wineType;
//    private List<Varietal> varietals;
//    private List<String> flavors;
//    private List<Pairing> parings;
//    private String appellation;
//    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
