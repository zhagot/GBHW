package ru.zhagot.ls3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Studies {

    public static final int COUNT_SHIPS = 3;
    public static final int SIZE_FIELD = 5;

    public static final int SHIP_VALUE = 1;
    public static final int EMPTY_SHIP_VALUE = 0;

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        do {
            int[] userWarField = getUserWarField();
            int[] computerWarField = getComputerWarField();

            int remainingCountUserShips = COUNT_SHIPS;
            int remainingCountComputerShips = COUNT_SHIPS;

            int[] computerDidShoots = new int[userWarField.length];
            boolean isUserStep = random.nextBoolean();

            while (remainingCountUserShips > 0 && remainingCountComputerShips > 0) {
                if (isUserStep) {
                    System.out.print("Укажите ячейку для атаки ");
                    int indCeil = scanner.nextInt();

                    if (computerWarField[indCeil] == SHIP_VALUE) {
                        System.out.println("Убил ");
                        remainingCountComputerShips--;
                        isUserStep = true;
                    } else {
                        System.out.println("Промах! ");
                        isUserStep = false;
                    }
                } else {
                    int indCeil = 0;
                    do {
                        indCeil = random.nextInt(userWarField.length);
                    } while (computerDidShoots[indCeil] == SHIP_VALUE);

                    if (userWarField[indCeil] == SHIP_VALUE) {
                        System.out.println("Противник убил вас в ячейке -> " + indCeil);
                        userWarField[indCeil] = -1;
                        System.out.println(Arrays.toString(userWarField));

                        remainingCountUserShips--;
                        isUserStep = false;
                    } else {
                        System.out.println("Противник стрелял по ячейке -> " + indCeil
                                + " и промахнулся");
                        isUserStep = true;
                    }
                    computerDidShoots[indCeil] = SHIP_VALUE;
                }
            }
            System.out.println("Хотите играть заново? Y/N");
        } while (scanner.next().equalsIgnoreCase("Y"));

        scanner.close();
    }

    public static int[] getComputerWarField() {
        int[] computerWarField = new int[SIZE_FIELD];

        int availableCountShips = COUNT_SHIPS;
        while (availableCountShips > 0) {
            int indCeil = random.nextInt(computerWarField.length); // 0..4

            if (computerWarField[indCeil] == EMPTY_SHIP_VALUE) {
                computerWarField[indCeil] = SHIP_VALUE;
                availableCountShips--;
            }
        }
        System.out.println("Противник закончил расстановку");
        return computerWarField;
    }

    public static int[] getUserWarField() {
        // Выполняем заполнение игровой карты пользователя

        int[] userWarField = new int[SIZE_FIELD];

        int availableCountShips = COUNT_SHIPS;
        while (availableCountShips > 0) {
            System.out.print("Укажите ячейку для коробля -> ");
            int indCeil = scanner.nextInt();

            if (indCeil >= userWarField.length || indCeil < 0) {
                System.out.println("Указана не корректная ячейка. Доступны ячейки от 0 до "
                + (userWarField.length - 1));

            } else if (userWarField[indCeil] != EMPTY_SHIP_VALUE) {
                System.out.println("Ячейка занята. Выберите другую!");

            } else {
                userWarField[indCeil] = SHIP_VALUE;
                availableCountShips--;

                System.out.println(Arrays.toString(userWarField));
            }
        }
        System.out.println("Вы успешно расставили корабли! ");
        return userWarField;
    }
}
