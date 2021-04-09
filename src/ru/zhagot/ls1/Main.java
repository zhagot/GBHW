package ru.zhagot.ls1;

public class Main {
    public static void main(String args[]) {
        byte byteVal;
        byteVal = 18;
        short shortVal = 1818;
        int intVal = 1984;
        long longVal = -1515151515151515L;
        float floatVal;
        floatVal = 37.5f;
        double doubleVal = 25.1;
        char charVal = 75;
        boolean booleanVal = true;
        int x = 110, y = 10; // for DZ 4
        int w = -18; // for DZ 5
        int z = 13; // for DZ 6
        String name = "Давид";

        System.out.println(mathResult()); // ДЗ 3.
        System.out.println(isNumberIn10to20(x, y)); // ДЗ 4
        isIntInConsole(w); // ДЗ 5
        System.out.println(isPositiveOrNegative(z)); // ДЗ 6
        hiName(name); // ДЗ 7
    }
// вычисления математического выражения по формуле.
    public static float mathResult() {
        float a, b, c, d;
        a = 15.5f;
        b = 18.2f;
        c = 10.0f;
        d = 2.0f;
        return (a * (b + (c / d)));
    }
// ДЗ 4.
    public static boolean isNumberIn10to20 (int x1, int y1) {
        int summ = x1 + y1;
        if (summ >= 10 && summ <= 20){
            System.out.println("Сумма переданных чисел = " + summ + ". Попадает в диапазон от 10 до 20. Передан параметр:");
            return true;
        }
        System.out.println("Сумма переданных чисел = " + summ + ". НЕ попадает в диапазон от 10 до 20. Передан параметр:");
        return false;
    }
// ДЗ 5.
    public static void isIntInConsole(int w1) {
        if (w1 >= 0) {
           System.out.println("Число: " + w1 + " - положительное");
        }
        if (w1 < 0) {
            System.out.println("Число: " + w1 + " - отрицательное");
        }
    }
// ДЗ 6.
    public static boolean isPositiveOrNegative(int z) {
        if (z >= 0){
            System.out.println("Число положительное, возвращаем false:");
            return false;
        }
        else{
            System.out.println("Число отрицательное, возвращаем true:");
            return true;
        }
    }
// ДЗ 7.
    public static void hiName(String name){
        System.out.println("Привет " + name + "! " + "Спасибо тебе большое за присланый урок! Очень интересно! =)");
    }
}
