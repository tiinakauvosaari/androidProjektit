package com.tiinak.animals;

import java.util.ArrayList;

public abstract class AnimalStorage {

    private static ArrayList<Animal> animals = new ArrayList<>();
    private static ArrayList<Animal> animalshome = new ArrayList<>();
    private ArrayList<Animal> animalstrain = new ArrayList<>();
    private ArrayList<Animal> animalsfight = new ArrayList<>();


   public static void addAnimal(Animal animal){
        animalshome.add(animal);
        animals.add(animal);
   }

    public void addAnimalHome(Animal animal){
        animalshome.add(animal);
    }

    public static void addAnimaltrain(Animal animal){
        //animalstrain.add(animal);
    }

    public void addAnimalfight(Animal animal){
        animalsfight.add(animal);
    }

    public static ArrayList<Animal> getAnimals(ArrayList<Animal> animalsHome) {
        return animalshome;
    }

    public ArrayList<Animal> getAnimals() {
          return animalshome;
    }
}
