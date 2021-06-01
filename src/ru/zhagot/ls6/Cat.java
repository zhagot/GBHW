package ru.zhagot.ls6;

public class Cat extends Animal{
    private static final int MAX_RUN_METRS = 200;

    public Cat(String name, int run, int swim){
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void catInfo(){
        System.out.println("Котика зовут: " + name + " и он(а) пробежал(а): " + run + " метров");
    }
    public void run(int runNumberMetrs){
        if (runNumberMetrs <= MAX_RUN_METRS){
            System.out.println("Кошка по кличке " + name + " пробежала " + runNumberMetrs + " метров.");
        } else {
            System.out.println("Ошибка, кошки не могут бежать более " + MAX_RUN_METRS + " метров");
        }
    }
    public void swim(int swimNumberMetrs){
        System.out.println("Кошки не умеют плавать!!!");
    }
}

