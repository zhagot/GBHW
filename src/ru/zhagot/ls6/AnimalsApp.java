package ru.zhagot.ls6;

public class AnimalsApp {

    public static void main(String[] args) {
//        Animal animal = new Animal();
        Cat catM = new Cat("Masha", 15, 5);
        Dog dogA = new Dog("Анжела", 50, 7);
        Dog dogB = new Dog("Bobik");
        catM.catInfo();
        dogA.dogInfo();
        dogA.run(55);
        dogB.run(515);
        dogA.swim(8);
        dogB.swim(15);
        catM.run(18);
        catM.swim(88);

    }

}
//   1. Создать классы Собака и Кот с наследованием от класса Животное.
//   2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//      Результатом выполнения действия будет печать в консоль.
//      (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//   3. У каждого животного есть ограничения на действия
//      (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//   4. Добавить подсчет созданных котов, собак и животных.

