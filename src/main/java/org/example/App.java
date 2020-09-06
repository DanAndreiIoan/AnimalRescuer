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
     animal.setAge(2);
     animal.setName("Rex");
     animal.setHealthLevel(8);
     animal.setHungerLevel(5);
     animal.setFavoriteFoodName("Bones");
     animal.setFavoriteActivityName("Running");

     EntertainmentActivity activity = new EntertainmentActivity("Running");

     Food food = new Food("Milk");
     food.setName("milk");
     food.setPrice(2.5);
     food.setInStock(true);
     food.setQuantity(855);
     food.setExpirationDate( LocalDateTime.of(2018, 12, 31, 12, 0, 0));

     MedicalStaff medic = new MedicalStaff();
     medic.setName("Dr. Who");
     medic.setSpecialization("General Medicine");


     Game game= new Game();
     game.setRescuer(adoptor);
     game.setAnimal(animal);
     game.setMedic(medic);

     adoptor.feed(animal, food);
     adoptor.entertain(animal, activity);

     animal.expressJoy();

     Animal dog = new Dog();
     dog.setName("Panda Maci");
     dog.expressJoy();

     Animal fish = new Fish();
     fish.setName("Bregović");
     fish.expressJoy();


    }
}
