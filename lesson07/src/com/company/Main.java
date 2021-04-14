package com.company;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Беляш", 3);
        cats[1] = new Cat("Пятняш", 8);
        cats[2] = new Cat("Лежаш", 5);
        Plate plate = new Plate(50);

        plate.infoOfFood();
        for (Cat i : cats)
            while (!i.isSatiety() && plate.getFood() >= i.getAppetite()) {

                {
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite());
                    plate.infoOfFood();
                }
            }


    }
}
