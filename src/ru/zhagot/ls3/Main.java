package ru.zhagot.ls3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int robotRandomNumber = getRobotRandomNumber();
        System.out.print("ПК загадал число: ");
        System.out.println(robotRandomNumber);
        System.out.print("Введите своё число: ");
        int humanInputNumber = getHumanInputNumber();
        System.out.println("Ты ввёл число: " + humanInputNumber);
        if (robotRandomNumber == humanInputNumber) {
            System.out.println("Вы угадали! Ура!");
        } else System.out.println("Не угаданно!");
    }
//    ПК загадывает число.
    public static int getRobotRandomNumber() {
        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt(10);
        return randomInt;
    }
//    Человек вводит число.
    public static int getHumanInputNumber(){
        Scanner sc = scanner;
        int humanNumber = sc.nextInt();
        return humanNumber;
    }
//    Сравниваем числа.


//    Написать программу, которая загадывает случайное число от 0 до 9
//    и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
//    больше ли указанное пользователем число, чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


}