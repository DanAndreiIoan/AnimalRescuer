package org.example;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {
      Adoptor adoptor = new Adoptor();
     adoptor.setName("Andrei");
     adoptor.setMoney(1000);

     Animal animal = new Animal();
     animal.age = 2;
     animal.setName("Rex");
     animal.healthLevel = 8;
     animal.hungerLevel = 5;
     animal.setFavoritFoodName("Bones");
     animal.setFavoritRecreationName("Running");

     Food food = new Food("Milk");
     food.name = "Milk";
     food.price = 50.10;
     food.inStock = true;
     food.quantity = 855;
     food.expirationDate = LocalDateTime.of(2018, 12, 31, 12, 0, 0);

     Entertainmant entertainmant = new Entertainmant("Running");
     entertainmant.name ="Running";

     Vet vet = new Vet();
     vet.setName("Doc");
     vet.setSpecialization("General");

     Game game= new Game();
     game.adoptor = adoptor;
     game.animal= animal;
     game.vet = vet;

    }
}
