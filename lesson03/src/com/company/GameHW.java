package com.company;


import java.util.Random;
import java.util.Scanner;

public class GameHW {

    public static final int TRYING_GUESS_NUMBER = 0;
    public static int randomNumber;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Загадано число от 0 до 9, попытайтесь угадать!");
        getRandomNumber();
        getNumberFromScanner();
        newGame();
        scanner.close();
    }

    public static int getRandomNumber() {
        randomNumber = random.nextInt(10);
        return randomNumber;
    }

    public static void getNumberFromScanner() {
        int answer;

        int remainingTry = 3;

        while (remainingTry > TRYING_GUESS_NUMBER) {
            answer = scanner.nextInt();
            remainingTry--;
            if (answer == randomNumber) {
                System.out.println("***Победа***");
                break;
            } else if (answer > randomNumber) {
                System.out.println("...Число находится ближе к 0,повторите попытку, у вас осталось " + remainingTry );
            } else {
                System.out.println("...Число находится ближе к 9, повторите попытку, у вас осталось " + remainingTry );
            }
        }System.out.println("К сожалению Ваши попытки закончились :( Верный ответ был - " + randomNumber);
    }

    public static void newGame() {
        System.out.println("Хотите сыграть еще раз? Нажмите: Да - 1, Нет - 2");
        String userData = scanner.next();
        if (userData.equals("1")){
            main(null);
        } System.out.println("До встречи!");
    }

  }

