package com.tiinak.animals;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class AnimalStorage implements Cloneable {

    private static ArrayList<Animal> animals = new ArrayList<>();
    private static ArrayList<Animal> animalshome = new ArrayList<>();
    private static ArrayList<Animal> animalstrain = new ArrayList<>();
    private static ArrayList<Animal> animalsfight = new ArrayList<>();


    public static void addAnimal(Animal animal){
        animalshome.add(animal);
        animals.add(animal);
    }

    public static void addAnimalHome(Animal animal){
        animalshome.add(animal);
    }

    public static void addAnimalTrain(Animal animal){
        animalstrain.add(animal);
    }

    public static void addAnimalFight(Animal animal){
        animalsfight.add(animal);
    }

    public static ArrayList<Animal> getAnimalsHome() {
        return animalshome;
    }
    public static ArrayList<Animal> getAnimals() {
        //compine three lists first
        ArrayList<Animal> unionAnimals = new ArrayList<>();
        unionAnimals.addAll(getAnimalsHome());
        unionAnimals.addAll(getAnimalsFight());
        unionAnimals.addAll(getAnimalsTrain());
        return unionAnimals;
    }
    public static ArrayList<Animal> getAnimalsTrain() {
        return animalstrain;
    }
    public static ArrayList<Animal> getAnimalsFight() {
        return animalsfight;
    }

    public static void removeFromList(Animal animal) {

        Iterator ite1 = animalshome.iterator();
        Iterator ite2 = animalstrain.iterator();
        Iterator ite3 = animalsfight.iterator();

        while (ite1.hasNext()) {
            Object element = ite1.next();
            if (element == animal) {
                animalshome.remove(animal);
                break;
            }
        }
        while (ite2.hasNext()) {
            Object element = ite2.next();
            if (element == animal) {
                animalstrain.remove(animal);
                break;
            }
            System.out.println();
        }
        while (ite3.hasNext()) {
            Object element = ite3.next();
            if (element == animal) {
                animalsfight.remove(animal);
                break;
            }
            System.out.println();
        }
    }

    public static void giveMaxHealth(Animal a) {
        if (a.getSpecies().equals("lion")) {
            a.maxHealth = 18;
        } else if (a.getSpecies().equals("mouse")) {
            a.maxHealth = 19;
        } else if (a.getSpecies().equals("owl")) {
            a.maxHealth = 17;
        }  else if (a.getSpecies().equals("snail")) {
            a.maxHealth = 20;
        } else if (a.getSpecies().equals("crocodile")) {
            a.maxHealth = 16;
        }

    }

}