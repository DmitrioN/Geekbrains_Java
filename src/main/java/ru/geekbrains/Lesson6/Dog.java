package ru.geekbrains.Lesson6;

public class Dog extends Animal {
    private static int dogsCount = 0; //Количество собак
    private static final int maxDistanceRun = 500; //Максимальное количество метров, которое может пробежать собака
    private static final int maxDistanceSwim = 10; //Максимальное количество метров, которое может проплыть собака

    public Dog(String name) {
        super(name);
        dogsCount++;
        System.out.println("Новая собака, по имени -" + name + ".");
    }

    @Override
    public void run(int dist) {
        if (dist <= maxDistanceRun) {
            System.out.println("Пес " + name + " пробежал " + dist + " метров.");
        } else {
            System.out.println("Пес не сможет пробежать данное расстрояние - " + dist);
        }
    }

    @Override
    public void toSwim(int dist) {
        if (dist <= maxDistanceSwim) {
            System.out.println("Пес " + name + " проплыл" + dist + " метров.");
        } else {
            System.out.println("Пес " + name + " не сможет проплыть данное расстрояние - " + dist);
        }
    }

    static int getCounterDog (){
        return dogsCount;
    }

}
