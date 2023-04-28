package com.tiinak.animals;

public class TrainingArea extends AnimalStorage {

    public void addAnimal(){

    }

    public void getAnimal(){

    }

    public void listAnimal(){

    }

    public static Animal createAnimal(Animal animal) {
        return animal;
    }

    public static void train(Animal animal){
        System.out.println(animal.attack);
        animal.attack = animal.attack + 2;
        animal.practise = animal.practise + 1;
        System.out.println(animal.attack);
    }
}
