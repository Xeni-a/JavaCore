package com.company;

public class Dog extends Animals {
    public Dog (String name, int lengthRun, int lengthSwimming) {
        super(name, lengthRun, lengthSwimming);
    }


    void run() {

        System.out.println(name + " has run " + lengthRun + " m");
    }
    void run(int lengthRun) {

        System.out.println(name + " has run " + lengthRun + " m");
    }

    void swim() {

        System.out.println(name + " has swim " + lengthSwimming + " m");
    }
    void swim(int lengthSwimming) {

        System.out.println(name + " has swim " + lengthSwimming + " m");
    }

}
