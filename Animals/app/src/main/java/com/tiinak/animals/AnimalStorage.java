package com.tiinak.animals;

import java.util.ArrayList;

public abstract class AnimalStorage {

    private static ArrayList<Animal> animals = new ArrayList<>();
    private static ArrayList<Animal> animalshome = new ArrayList<>();
    private ArrayList<Animal> animalstrain = new ArrayList<>();
    private ArrayList<Animal> animaslfight = new ArrayList<>();


   public static void addAnimal(Animal animal){
        animalshome.add(animal);
        animals.add(animal);
   }

    public static ArrayList<Animal> getAnimals(ArrayList<Animal> animalsHome) {
        return animalshome;
    }

    public ArrayList<Animal> getAnimals() {
          return animalshome;
    }
}
