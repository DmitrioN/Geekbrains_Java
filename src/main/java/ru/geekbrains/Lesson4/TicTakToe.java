package ru.geekbrains.Lesson4;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe {
    //Поле
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;


    // Ячейки поля
    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
        }
        }
    }

    private static void initMap() {
        map = new  char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
