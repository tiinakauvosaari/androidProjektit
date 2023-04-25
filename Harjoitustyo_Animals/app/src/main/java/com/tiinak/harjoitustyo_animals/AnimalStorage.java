package com.tiinak.harjoitustyo_animals;

import android.content.Context;

import java.util.ArrayList;

public class AnimalStorage {

    protected ArrayList<AnimalListAdapter.Animal> animals = new ArrayList<>();
    protected ArrayList<AnimalListAdapter.Animal> animalsTrain = new ArrayList<>();
    protected ArrayList<AnimalListAdapter.Animal> animalsFight = new ArrayList<>();
    protected static AnimalStorage animalstorage = null;
    protected Context context;

    private AnimalStorage(){
    }

    public static AnimalStorage getInstance(){
        if(animalstorage == null) animalstorage = new AnimalStorage();
        return animalstorage;
    }

    public void addAnimal(AnimalListAdapter.Animal animal){
        animals.add(animal);
    }

    public ArrayList<AnimalListAdapter.Animal> getAnimals() {
        return animals;
    }


}
