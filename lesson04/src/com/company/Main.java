package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_Y = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
    initMap();
    printMap();





   while (true) {
       humanTurn();
       printMap();

       if (checkWin(DOT_X)) {
           System.out.println("***Победил человек***");
           break;
       }
       if (isMapFull()) {
           System.out.println("***Ничья***");
           break;
       }
       aiTurn();
       printMap();
       if (checkWin(DOT_Y)) {
           System.out.println("***Победил компьютер***");
           break;
       }
       if (isMapFull()) {
           System.out.println("***Ничья***");
           break;
       }
   }

        System.out.println("Игра закончена!");
    scanner.close();
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        } return true;
    }

    public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }


    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Компьютер походил в точку -> " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_Y;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате: Х Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));

        map[x][y] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){ return false;}
        return map[x][y] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }
    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print((map[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }























}

