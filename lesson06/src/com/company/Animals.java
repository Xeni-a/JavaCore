package com.company;

public class Animals {

    protected String name;
    protected int lengthRun;
    protected int lengthSwimming;



    public Animals(String name, int lengthRun, int lengthSwimming) {

        this.name = name;
        this.lengthRun = lengthRun;
        this.lengthSwimming = lengthSwimming;
    }
    void run() {
        System.out.println(name + " has run " + lengthRun);
    }
    void swim() {
        System.out.println(name + " has swim " + lengthSwimming);
    }

}
