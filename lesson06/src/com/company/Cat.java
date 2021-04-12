package com.company;

public class Cat extends Animals {

    private String massage;

    public Cat(String name, int lengthRun, int lengthSwimming) {
        super(name, lengthRun, lengthSwimming);
    }
    void run() {

        System.out.println(name + " has run " + lengthRun + " m");
    }
    void run(int lengthRun) {

        System.out.println(name + " has run " + lengthRun + " m");
    }
    @Override
    void swim() {
        System.out.println(name + " has't swiming ");
    }


}
