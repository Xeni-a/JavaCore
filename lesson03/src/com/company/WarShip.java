package com.company;


import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class WarShip {
   public static Scanner scanner = new Scanner(System.in);
   public static Random random = new Random();

   public static final int COUNT_SHIPS = 3;
    public static final int FINAL_FIELD_SIZE = 5;

    public static final int SHIP_VALUE = 1;
    public static final int EMPTY_SHIP_VALUE = 0;


     public static void main(String[] args) {
         do {
             int[] userWarField = getUserWarField();
             int[] compWarField = getCompWarField();

             int remainingCountUserShips = COUNT_SHIPS;
             int remainingCountCompShips = COUNT_SHIPS;

             int[] compDidShoots = new int[userWarField.length];

             boolean isUserStep = true;

             while (remainingCountCompShips > 0 && remainingCountUserShips > 0) {
                 if (isUserStep) {
                     System.out.println("Укажите ячейку для атаки: ");
                     int indCell = scanner.nextInt();

                     if (compWarField[indCell] == SHIP_VALUE) {
                         System.out.println("Убил");
                         remainingCountCompShips--;
                         isUserStep = true;
                     } else {
                         System.out.println("Промах");
                         isUserStep = false;
                     }
                 } else {
                        int indCell = 0;
                        do {
                            indCell = random.nextInt(userWarField.length);
                        } while (compDidShoots[indCell] == SHIP_VALUE);
                      if(userWarField[indCell] == SHIP_VALUE)  {
                          System.out.println("Противник убил вас в ячейке " + indCell);
                          userWarField[indCell] = -1;
                          System.out.println(Arrays.toString(userWarField));
                          remainingCountUserShips--;
                          isUserStep = false;
                      } else {
                          System.out.println("Противник стрелял по ячейке " + indCell + " , но промахнулся");
                          isUserStep = true;
                      }
                      compDidShoots[indCell] = SHIP_VALUE;
                 }

             }
             System.out.println("Хотите сыграть еще раз? -> Y/N");
         } while (scanner.next().equalsIgnoreCase("Y"));
         System.out.println("Всего хорошего, спасибо за игру!");
         scanner.close();
     }


     private static int[] getCompWarField() {
         int availableCountShips = COUNT_SHIPS ;

         int[] compWarField = new int[FINAL_FIELD_SIZE];

         while (availableCountShips > EMPTY_SHIP_VALUE) {
             int indCell = random.nextInt(compWarField.length);

             if(compWarField[indCell] == EMPTY_SHIP_VALUE) {
                 compWarField[indCell] = SHIP_VALUE;
                 availableCountShips--;
             }
         }
         System.out.println("Противник закончил расстановку кораблей");
         return compWarField;
     }

    private static int[] getUserWarField() {
        int availableCountShips = COUNT_SHIPS ;

        int[] userWarField = new int[FINAL_FIELD_SIZE];

        while (availableCountShips > EMPTY_SHIP_VALUE) {
            System.out.print("Укажите ячейку для коробля ->: ");
            int indCell = scanner.nextInt();
   
            if (indCell >= userWarField.length || indCell < 0) {
                System.out.println("Указана не корректная ячейка. Доступны ячейки от 0 до " + (userWarField.length - 1));
            } else if (userWarField[indCell] != EMPTY_SHIP_VALUE) {
                System.out.println("Ячейка занята, выберите другую");
            } else {
                userWarField[indCell] = SHIP_VALUE;
                availableCountShips--;
                System.out.println(Arrays.toString(userWarField));
            }
        }
        System.out.println("Вы успешно расставили корабли");
        return userWarField;
    }
}
