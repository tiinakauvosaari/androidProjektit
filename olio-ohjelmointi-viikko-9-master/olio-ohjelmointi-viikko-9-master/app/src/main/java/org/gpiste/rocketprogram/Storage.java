package org.gpiste.rocketprogram;

import java.util.ArrayList;

public class Storage {
     private ArrayList<Rocket> rockets = new ArrayList<>();

     private static Storage storage = null;


    private Storage() {
    }

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public void addRocket(Rocket rocket) {
        rockets.add(rocket);
    }

    public Rocket getRocketById(int id) {
        return rockets.remove(id);
    }

    public void listRockets() {
        int i = 0;
        for (Rocket rocket : rockets) {
            System.out.println(i++ + ": " + rocket.getName());
        }
    }

    public void listRocketsInformation() {
        for (Rocket rocket : rockets) {
            rocket.printSpecs();
        }
    }



}
