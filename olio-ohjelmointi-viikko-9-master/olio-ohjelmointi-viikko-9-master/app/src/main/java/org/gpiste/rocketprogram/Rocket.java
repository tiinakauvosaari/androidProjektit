package org.gpiste.rocketprogram;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Rocket implements Serializable, StartStop {
    protected String name;
    protected int mass;
    protected int height;

    protected int image;
    protected ArrayList<RocketEngine> engines = new ArrayList<>();
    protected String id;
    protected static final long serialVersionUID = 24234298L;

    public static int rocketCounter = 0;

    public Rocket() {
        this("Falcon heavy", 70, 100_000);
    }

    public Rocket(String name, int height, int massParameter) {
        this.name = name;
        this.height = height; // Option 1
        mass = massParameter; // Option 2

        id = "NCC-" + (int)(Math.random() * 90000 + 1000);

        rocketCounter++;


    }

    public void start() {
        System.out.println(name + " käynnistyy");
        for (RocketEngine engine : engines) {
            engine.start();
        }
    }

    public void stop() {
        System.out.println(name + " sammuu");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int name) {
        this.name = String.valueOf(name);
    }

    public void setMass(int mass) {
        if (mass < 0) {
            return;
        }

        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<RocketEngine> getEngines() {
        return engines;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getImage() {
        return image;
    }

    public Rocket fly() {
        printCountdown(10);
        this.start();
        System.out.println(name + " lentää avaruuteen!");
        return null;
    }

    public void printSpecs() {
        System.out.println("*** " + name + " (" + id + ") ***");
        System.out.println("Pituus: " + height + " m");
        System.out.println("Massa: " + mass + " kg");
        for(RocketEngine engine : engines) {
            engine.printSpecs();
        }

    }

    private void doSomenthingExtremeImportantCalculation(int x) {
        int z = 1000_000;
        int a = 22;
        double b = 3.14159265;
        double value = Math.pow(b, a) / z * x;

        Locale locale = new Locale("fi", "FI");

        //DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        decimalFormat.applyPattern("###,###.00");
        String formattedValue = decimalFormat.format(value);

        System.out.println("Arvo on " + formattedValue);
    }

    public void doNothing() {
        //System.out.println(value); // value does not exist in method doNothing()!

    }

    public void printCountdown(int x) {
        if (x < 0) {
            System.out.println();
            return;
        }
        System.out.print(x + " ");
        printCountdown(x - 1);
    }



    public String toString() {
        return name;
    }
}
