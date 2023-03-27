package org.gpiste.rocketprogram;

public class Starship extends Rocket {

    public Starship() {
        super("Starship", 130, 5_000_000);

        int x = 33;
        while(x-- > 0) {
            engines.add(new RocketEngine("Raptor 2", 1600));
        }
        image =  R.drawable.starship;
    }
    public Rocket fly() {
        printCountdown(10);
        this.start();
        System.out.println(name + " lentää avaruuteen!");
        this.land();
        return this;
    }

    public void land() {
        System.out.println(name + " laskeutuu takaisin maahan");
    }
}
