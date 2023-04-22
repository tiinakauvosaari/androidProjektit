package com.tiinak.harjoitustyo_animals;

import java.io.Serializable;

public class AnimalListAdapter {


    public static class Animal implements Serializable {

            protected String name;
            protected String species;
            protected int attack;
            protected int defence;
            protected int maxHealth;
            protected int practise;
            protected int winningsNumber;
            protected int attacksNumber;
            protected int id;

            private int i = 0;


            public Animal(String name, String species,int attack, int defence, int maxHealth) {
                this.name = name;
                this.species = species;
                this.attack = attack;
                this.defence = defence;
                this.maxHealth = maxHealth;
                this.practise = 0;
                this.attacksNumber = 0;
                this.winningsNumber = 0;
                this.id = i;
                i++;
            }

            public String getName() {
                return name;
            }

            public String Species() {
                return species;
            }

            public int getAttack() {
                return attack;
            }

            public int getDefence() {
                return defence;
            }

            public int getMaxHealth() {
            return maxHealth;
            }

            public int getAttacksNumber() {
            return attacksNumber;
            }

            public int getPractise() {
            return practise;
            }

            public int getWinningsNumber() {
            return winningsNumber;
            }

            public int getId() {
            return id;
            }
       }
}
