package ru.geekbrains.Lesson6;

public class Animal {
    public String name;
    private static int animalCount = 0;

    public Animal(String name){
        this.name = name;
        animalCount++;
    }

    public  void run(int dist) {
        System.out.println("Животное: " + name + " прыгнуло на " + dist + " метров.");
    }

    public  void toSwim(int dist) {
        System.out.println("Животное: " + name + " плывет" + dist + " метров.");
    }

    public void getCounterAnimal() {
        System.out.println("Количество собак = " + Dog.getCounterDog() + ".");
        System.out.println("Количество котов = " + Cat.getCounterCat() + ".");
        System.out.println("Количество животных = " + animalCount + ".");
    }
}
