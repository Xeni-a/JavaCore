package com.company;

public class Main {
    static int catCount = 0;
    static int dogCount = 0;
    public static void main(String[] args) {

        Dog inu = new Dog("Inu", 500, 10);
        dogCount++;
        Dog inu2 = new Dog("Inu2", 510, 15);
        dogCount++;
        System.out.println("Общее кол-во собак " + dogCount);
        Cat neko = new Cat("Neko", 200, 0);
        catCount++;
        System.out.println("Общее кол-во котов " + catCount);
        Animals[] animals = {inu, inu2, neko};

        for (int i = 0; i < animals.length; i++) {

            animals[i].swim();
            animals[i].run();
        }

//        neko.swim();
//        neko.run(200);
//        inu.swim(10);
//        inu.run(500);
    }
}
