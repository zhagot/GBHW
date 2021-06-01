package ru.zhagot.ls6;

public class Animal {
    String name;
    int run;
    int swim;
    public Animal(){
    }
    public Animal(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println("Бежим(выведено из класса Животные)");
    }
    public void swim(){
        System.out.println("Плывём(выведено из класса Животные)");
    }
}
