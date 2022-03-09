package com.alta.rest.restandpoint.model;

import javax.persistence.*;


@Entity
@Table(name="food")
public class foodModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="foodPrice")
    private String foodPrice;
    @Column(name="rate")
    private String rate;
    @Column(name="foodName")
    private String foodName;
    @Column(name="catid")
    private Double catid;
    @Column(name="description")
    private String description;
    @Column(name="img")
    private String img;

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodPrice() {
        return this.foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Double getCatId() {
        return this.catid;
    }

    public void setCatId(Double catId) {
        this.catid = catId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }



}
