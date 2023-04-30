package com.tiinak.animals;

public class TrainingArea extends AnimalStorage {


    public static Animal createAnimal(Animal animal) {
        return animal;
    }

    public static void train(Animal animal){
        animal.attack += 2;
        animal.practise += 1;
    }
}
