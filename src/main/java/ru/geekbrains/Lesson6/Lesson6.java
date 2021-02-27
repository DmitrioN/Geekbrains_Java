package ru.geekbrains.Lesson6;

public class Lesson6 {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Шарик");
        Animal dog2 = new Dog("Бобик");
        Animal dog3 = new Dog("Лунтик");
        Animal dog4 = new Dog("Валли");
        Animal cat1 = new Cat("Барсик");
        Animal cat2 = new Cat("Мурзик");
        Animal cat3 = new Cat("Пират");
        Animal cat4 = new Cat("Леопольд");

        //Работаем с котами
        cat1.toSwim(100);
        cat1.run(100);
        cat2.toSwim(200);
        cat2.run(200);
        cat3.toSwim(300);
        cat3.run(300);
        cat3.toSwim(400);
        cat4.run(400);

        //Работаем с собаками
        dog1.toSwim(1);
        dog1.run(100);
        dog2.toSwim(5);
        dog2.run(200);
        dog3.toSwim(11);
        dog3.run(300);
        dog3.toSwim(9);
        dog4.run(400);

        cat1.getCounterAnimal();

    }
}
