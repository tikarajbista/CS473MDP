package com.example.tikarajbista.w1l4;

public class Food {
    private String name;
    private String desc;
    private int id;

    public Food(String name, String des, int id){
        this.name = name;
        this.desc = des;
        this.id = id;
    }

    public static final Food[] food = {new Food("Baking", "Organic Baking!", R.drawable.baking),
        new Food("breakfast", "Made by Organic products!", R.drawable.breakfast),
        new Food("Diary", "Natural Diary Products!" ,R.drawable.cheese),
        new Food("chocolate", "Fresh Chocolate ever!", R.drawable.mints),
        new Food("PopCorn", "best popcorn with butter!", R.drawable.popcorn)};

    public String getDesc(){
        return desc;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return this.name;
    }
}
