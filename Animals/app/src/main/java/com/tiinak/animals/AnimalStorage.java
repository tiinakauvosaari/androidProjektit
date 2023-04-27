package com.tiinak.animals;

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

  //  public static ArrayList<Animal> getAnimals(ArrayList<Animal> animals) {
 //       return animals;
  //  }

 //   public static ArrayList<Animal> getAnimalsHome(ArrayList<Animal> animalshome) {
 //       return animalshome;
 //   }

  //  public static ArrayList<Animal> getAnimalsTrain(ArrayList<Animal> animalstrain) {
  //      return animalstrain;
  //  }

  //  public static ArrayList<Animal> getAnimalsFight(ArrayList<Animal> animalsfight) {
 //       return animalsfight;
 //   }


    public static ArrayList<Animal> getAnimalsHome() {
          return animalshome;
    }
    public static ArrayList<Animal> getAnimals() {
        return animals;
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
        Iterator ite3 = animalstrain.iterator();

        while (ite1.hasNext()) {
            Object element = ite1.next();
            if (element == animal) {
                animalshome.remove(animal);
                System.out.print(element + " Heippa hei " + element);
                break;
            }
        }
        while (ite2.hasNext()) {
            Object element = ite2.next();
            if (element == animal) {
                animalstrain.remove(animal);
                System.out.print(element + " Heippa hei " + element);
                break;
            }
            System.out.println();
        }
        while (ite3.hasNext()) {
            Object element = ite3.next();
            if (element == animal) {
                animalsfight.remove(animal);
                System.out.print(element + " Heippa hei " + element);
                break;
            }
            System.out.println();
        }
    }
    @Override
    public AnimalStorage clone() {
        try {
            AnimalStorage clone = (AnimalStorage) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
