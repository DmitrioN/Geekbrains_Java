package ru.geekbrains.Lesson6;

public class Cat extends Animal {
    private static int catsCount = 0; //Количество котов
    private static final int maxDistance = 200; //Максимальное количество метров, которое может пробежать кот

    public Cat(String name) {
        super(name);
        catsCount++;
        System.out.println("Новый кот, по имени - " + name + ".");
    }

    @Override
    public void run(int dist) {
        if (dist <= maxDistance) {
            System.out.println("Кот " + name + " пробежал " + dist + " метров.");
        } else {
            System.out.println("Кот " + name + " не сможет пробежать данное расстрояние - " + dist);
        }
    }

    @Override
    public void toSwim(int dist) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    static int getCounterCat() {
        return catsCount;
    }
}
