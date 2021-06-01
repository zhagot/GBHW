package ru.zhagot.ls6;

public class Dog extends Animal{
    private static final int MAX_RUN_METRS = 500;
    private static final int MAX_SWIM_METRS = 10;
    public Dog(){

    }
    public Dog(String name, int run, int swim){
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    public Dog(String name) {
        this.name = name;
    }
    public void dogInfo(){
        System.out.println("Собака по кличке " + name + " пробежала " + run + " метров. И проплыла " + swim + " метров.");
    }
    public void run(int runNumberMetrs){
        if (runNumberMetrs <= MAX_RUN_METRS){
            System.out.println("Собака по кличке " + name + " пробежала " + runNumberMetrs + " метров.");
        } else {
            System.out.println("Ошибка, сабаки не могут бежать более " + MAX_RUN_METRS + " метров");
        }
    }
    public void swim(int swimNumberMetrs){
        if (swimNumberMetrs <= MAX_SWIM_METRS){
            System.out.println("Собака по кличке " + name + " проплыла " + swimNumberMetrs + " метров.");
        } else {
            System.out.println("Ошибка, сабаки не могут бежать более " + MAX_SWIM_METRS + " метров");
        }
    }
}
