package ru.zhagot.ls5;

public class Employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String fio;
    String position;
    String email;
    long phone;
    int zp;
    int age;

    public Employee(String fio, String position, String email, long phone, int zp, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
//        if (age > 30) {
//            System.out.println("Сотрудник по имени " + fio + " работает на позиции " + position + ", его Е-майл: " + email +
//                    ", телефон: " + phone + ". У него зарплата " + zp + " тыс. руб. Его возраст: " + age + " лет.");
//        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}