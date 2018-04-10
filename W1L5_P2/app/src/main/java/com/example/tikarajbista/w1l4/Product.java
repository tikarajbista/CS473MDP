package com.example.tikarajbista.w1l4;

import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    private String title;
    private Double price;
    private String color;
    private int itemId;
    private String image;
    private String description;

    public Product(String title, double price, String color, int itemId, String img, String description){
        this.title = title;
        this.price = price;
        this.color = color;
        this.itemId = itemId;
        this.image = img;
        this.description = description;
    }

    public String getTitle(){
        return  title;
    }

    public Double getPrice(){
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getItemId() {
        return itemId;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
