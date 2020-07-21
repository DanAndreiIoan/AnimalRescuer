package org.example;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {
      Adoptor adoptor = new Adoptor();
     adoptor.name = "Andrei";
     adoptor.money = 1000;

     Animal animal = new Animal();
     animal.age = 2;
     animal.name ="Rex";
     animal.healthLevel = 8;
     animal.hungerLevel = 5;
     animal.favoritFoodName = "Bone";
     animal.favoritRecreationName = "Running";

     Food food = new Food("Milk");
     food.name = "Milk";
     food.price = 50.10;
     food.inStock = true;
     food.quantity = 855;
     food.expirationDate = LocalDateTime.of(2018, 12, 31, 12, 0, 0);

     Entertainmant entertainmant = new Entertainmant("Running");
     entertainmant.name ="Running";

     Vet vet = new Vet();
     vet.name = "Dr.House";
     vet.specialization = "General";

     Game game= new Game();
     game.adoptor = adoptor;
     game.animal= animal;
     game.vet = vet;

    }
}
