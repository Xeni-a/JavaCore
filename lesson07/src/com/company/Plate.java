package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int countFood) {
        if (hasEnoughFood(countFood)) {
            food -= countFood;
            return true;

        }
        return false;

    }

    public boolean hasEnoughFood(int needFoodForCat) {
        return food >= needFoodForCat;
    }

    public void addFood(int countFood) {
        food += countFood;
    }

    public void infoOfFood() {
        System.out.println("Количество оставшейся в тарелке еды: " + food);
    }

}
