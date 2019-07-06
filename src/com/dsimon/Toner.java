package com.dsimon;

public class Toner {
    private String model;
    private int capacity;
    private int howFull;

    public Toner(String model) {
        this.model = model;
        this.capacity = 100;
        this.howFull = 100;
    }

    public void fillToner(int howMuchToFill) {
        if (howMuchToFill < 0) {
            System.out.println("Invalid amount");
        } else if (howMuchToFill + howFull >= 100) {
            howFull = 100;
            System.out.println("The toner is full");
        } else {
            howFull += howMuchToFill;
            System.out.println("The toner is " + howFull + "% full");
        }
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHowFull() {
        return howFull;
    }
}
