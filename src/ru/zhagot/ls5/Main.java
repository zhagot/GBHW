package ru.zhagot.ls5;

import java.sql.SQLOutput;

public class Main {
    public static final int AGE = 30;

    public static void main(String[] args) {

    Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Хубаев Давид", "Саппорт", "websix@vk.com", 89991115577L, 50000, 30);
            persArray[1] = new Employee("Zhagot Denis", "Support", "zhagot@zhagot.ru", 89991115577L, 50000, 37);
            persArray[2] = new Employee("Бударин Владимир", "Саппорт", "vova@vk.com", 89991115577L, 60000, 25);
            persArray[3] = new Employee("Григорьев Илья", "Саппорт", "grig@vk.com", 89991115577L, 50000, 31);
            persArray[4] = new Employee("Антощентов Павел", "Админ", "tov_marshal@vk.com", 89991115577L, 70000, 31);

        // Первый вариант решения.
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > AGE) {
                System.out.println(persArray[i].fio);
            }
        }
        System.out.println("---");
        // Второй вариант решения.
        for (Employee freeWorker: persArray){
            if (freeWorker.age > AGE) {
                System.out.println("Сотрудник по имени " + freeWorker.fio + " работает на позиции " + freeWorker.position + ", его Е-майл: " + freeWorker.email +
                        ", телефон: " + freeWorker.phone + ". У него зарплата " + freeWorker.zp + " тыс. руб. Его возраст: " + freeWorker.age + " лет.");
            }
        }
    }
}
