package org.example;

import java.time.LocalDateTime;

public class Food {
    String name;
    double price;
    double quantity;
    boolean inStock;
    LocalDateTime expirationDate;

public Food(String name){
    this.name=name;
}
}
