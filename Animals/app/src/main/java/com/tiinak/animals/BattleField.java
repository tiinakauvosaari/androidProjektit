package com.tiinak.animals;

public class BattleField extends AnimalStorage {


    public static Animal createAnimal(Animal animal) {
        return animal;
    }



    public static String fight(Animal a, Animal b) {

        String teksti = "";

        while (a.getMaxHealth() > 0 && b.getMaxHealth() > 0) {
            //System.out.println(a.getName() + "(A:" + a.getAttack() + ") + hyökkää kohti eläintä " + b.getName() + "(D:" + b.getDefence() + " maxHealt" + b.getMaxHealth());
            teksti = teksti +  a.getName() + "(A:" + a.getAttack() + ") + hyökkää kohti eläintä " + b.getName() + "(D:" + b.getDefence() + " maxHealt" + b.getMaxHealth() + "\n";
            int b_maxH = b.getMaxHealth() - (a.getAttack() - b.getDefence());
            b.maxHealth = b_maxH;
            teksti = teksti + b.getName() + " elämäpisteet ovat nyt  " + b.getMaxHealth() +"\n";
            if (b_maxH <= 0) {
                b.attacksNumber += 1;
                a.attacksNumber += 1;
                a.winningsNumber += 1;
                teksti = teksti + a.getName() + " voitti." +"\n";
            } else {
                teksti = teksti + b.getName() + "(A:" + b.getAttack() + "  ) + hyökkää kohti eläintä " + a.getName() + "(D:" + a.getDefence() + " maxHealt" + a.getMaxHealth() +"\n";
                int a_maxH = a.getMaxHealth() - (b.getAttack() - a.getDefence());
                a.maxHealth = a_maxH;
                teksti = teksti + a.getName() + " defence " + a.getDefence() + " ja maxHealth " + a.getMaxHealth() +"\n";
                b.maxHealth = b_maxH;
                if (a_maxH <= 0) {
                    b.attacksNumber += 1;
                    a.attacksNumber += 1;
                    b.winningsNumber += 1;
                    teksti = teksti + b.getName() + " voitti." + "\n";
                }
            }

        }

        return teksti;
        //while
        }//fight

    } //class


