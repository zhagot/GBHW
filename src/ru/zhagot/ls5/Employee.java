package ru.zhagot.ls5;

public class Employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String fio;
    private String position;
    private String email;
    private long phone;
    private int zp;
    private int age;

    public Employee(String fio, String position, String email, long phone, int zp, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
        if(age > 30) {
            System.out.println("Сотрудник по имени " + fio + " работает на позиции " + position + ", его Е-майл: " + email +
                    ", телефон: " + phone + ". У него зарплата " + zp + " тыс. руб. Его возраст: " + age + " лет.");
        }
    }
}
