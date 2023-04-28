package com.tiinak.animals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class Animal implements Serializable {

    protected String name;
    protected String species;
    protected int attack;
    protected int defence;
    protected int maxHealth;
    protected int practise;
    protected int winningsNumber;
    protected int attacksNumber;
    protected int id;
    protected int image;

    protected int i = 0;

    static int count = 0;

    public Animal(String name, String species, int attack, int defence, int maxHealth) {
                this.name = name;
                this.species = species;
                this.attack = attack;
                this.defence = defence;
                this.maxHealth = maxHealth;
                this.practise = 0;
                this.attacksNumber = 0;
                this.winningsNumber = 0;
                this.id = this.idCounter();

                if (species.equals("lion")) {
                    image = R.drawable.lion;
                } else if (species.equals("mouse")) {
                    image = R.drawable.mouse;
                } else if (species.equals("owl")) {
                    image = R.drawable.owl;
                } else if (species.equals("rhino")) {
                    image = R.drawable.rhino;
                } else if (species.equals("snail")) {
                    image = R.drawable.snail;
                } else if (species.equals("crocodile")) {
                    image = R.drawable.crocodile;
                }
            }

    public Animal(Animal animal) {
        this.name = animal.name;
        this.species = animal.species;
        this.attack = animal.attack;
        this.defence = animal.defence;
        this.maxHealth = animal.maxHealth;
        this.practise = 0;
        this.attacksNumber = 0;
        this.winningsNumber = 0;
        this.id = animal.id;

        if (species.equals("lion")) {
            image = R.drawable.lion;
        } else if (species.equals("mouse")) {
            image = R.drawable.mouse;
        } else if (species.equals("owl")) {
            image = R.drawable.owl;
        } else if (species.equals("rhino")) {
            image = R.drawable.rhino;
        } else if (species.equals("snail")) {
            image = R.drawable.snail;
        } else if (species.equals("crocodile")) {
            image = R.drawable.crocodile;
        }
    }

    public String getName() {
                return name;
            }

    public String getSpecies() {
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

    public int getImage() {
                return image;
            }

    static int idCounter(){
                return count++;
            }

    public boolean isSelected() {
        return true;
    }
}
