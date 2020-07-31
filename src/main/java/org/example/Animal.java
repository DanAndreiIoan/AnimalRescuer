package org.example;

public class Animal {

   private String name;
    double age;
    double healthLevel;
    double hungerLevel;
    double spiritLevel;
   private String favoritFoodName;
   private String favoritRecreationName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoritFoodName() {
        return favoritFoodName;
    }

    public void setFavoritFoodName(String favoritFoodName) {
        this.favoritFoodName = favoritFoodName;
    }

    public String getFavoritRecreationName() {
        return favoritRecreationName;
    }

    public void setFavoritRecreationName(String favoritRecreationName) {
        this.favoritRecreationName = favoritRecreationName;
    }
}

