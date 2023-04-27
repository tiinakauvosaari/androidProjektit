package com.tiinak.animals;

public class Home extends AnimalStorage implements Cloneable{


    public static Animal createAnimal(Animal animal){

       // AnimalStorage.addAnimal(animal);
        return animal;
    }

    @Override
    public Home clone() {
        return (Home) super.clone();
    }
}
