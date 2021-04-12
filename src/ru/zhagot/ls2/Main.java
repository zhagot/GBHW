package ru.zhagot.ls2;

public class Main {
    public static void main(String[] args) {

        convNumbs();    // ДЗ 1.
        arrFully();     // ДЗ 2.
    }
        private static void convNumbs() { // ДЗ 1.
        int[] arrNumbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Глубина массива: " + arrNumbers.length);
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("arrNumbers[" + i + "] = " + arrNumbers[i] + " - до изменения");
            if (arrNumbers[i] == 0) {
                arrNumbers[i] = 1;
            }
            if (arrNumbers[i] == 1) {
                arrNumbers[i] = 0;
            }
            System.out.println("arrNumbers[" + i + "] = " + arrNumbers[i] + " - после изменения");
            System.out.println();
        }
    }
//    Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void arrFully () {
        int x = 0;
        int[] arrFull = new int[8];
        for (int i = 0; i < arrFull.length; i++) {
            arrFull[i] = x;
            x += 3;
            System.out.println(arrFull[i]);
        }
    }
//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;
}
