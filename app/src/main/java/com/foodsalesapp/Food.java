package com.foodsalesapp;

import java.util.ArrayList;

public  class Food {
    String name;
    float price,rate;
    int cookingTime;
    int imageResourceId;

    public Food(String name, int cookingTime ,
                int price,float rate,int imageResourceId) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.imageResourceId = imageResourceId;
        this.price = price;
        this.rate = rate;
    }
    public static ArrayList<Food> SAMPLE_FOODS() {
        ArrayList<Food> items = new ArrayList<>();
        items.add(new Food("Pizza", 20, 1500, 4.8f, R.drawable.pizza_icon));
        items.add(new Food("Hamburger", 15, 1200, 4.5f, R.drawable.hamburger_icon));
        items.add(new Food("Scrambled Eggs",2, 1000, 1,R.drawable.scrambled_eggs));
        items.add(new Food("Eggs",2, 2000, 4,R.drawable.scrambled_eggs));
        items.add(new Food("Pasta", 18, 1800, 4.2f, R.drawable.pasta_icon));
        items.add(new Food("Vegetarian Chili",2, 2000, 3,R.drawable.vegetarian_chili));
        items.add(new Food("Sushi", 25, 2200, 4.9f, R.drawable.sushi_icon));
        items.add(new Food("Pasta with Sauce",4, 2000,2,R.drawable.pasta));
        items.add(new Food("Salad", 12, 800, 4.7f, R.drawable.salad_icon));
        items.add(new Food("Burrito", 18, 1600, 4.3f, R.drawable.burrito_icon));
        items.add(new Food("Soup", 10, 1500, 4.1f, R.drawable.soup_icon));
        items.add(new Food("Vegetarian",2, 3000, 2,R.drawable.vegetarian_chili));
        items.add(new Food("Fried Rice", 15, 1000, 4.4f, R.drawable.fried_rice_icon));
        items.add(new Food("Chicken Curry", 22, 2000, 4.6f, R.drawable.chicken_curry_icon));
        items.add(new Food("Tacos", 14, 1400, 4.8f, R.drawable.tacos_icon));
        items.add(new Food("Chicken Stir-Fry", 3, 2300,2,R.drawable.chicken));
        items.add(new Food("Banana Bread",1, 1000, 3,R.drawable.banana_bread));
        return items;
    };
}
