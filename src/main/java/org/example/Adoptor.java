package org.example;

public class Adoptor {
   private String name;
   private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
public void feed(Animal animal, Food food){
        System.out.println(this.name +" just gave some"+ food.getName() + "food to"+ animal.getName());
}
}

