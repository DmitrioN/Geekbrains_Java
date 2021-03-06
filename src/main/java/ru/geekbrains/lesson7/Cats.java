package ru.geekbrains.lesson7;

public class Cats {
    //основные параметры класса Cats
    private String name;
    private int appetite;
    private int hunger;
    private boolean wellFed;

    public Cats (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    public Cats (String name, int appetite, int hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
        this.wellFed = false;
    }

    // Получить текущее состояние кота
    public void catInfo (){
        if (wellFed) {
            System.out.println("Кот " + name + " не голодный.");
        } else {
            System.out.println("Кот " + name + "голодный");
        }
    }

    // кормим кота
    public void eat (Plate plate) {
        if (plate.amountFoodInPlate >= appetite) {
            plate.decreaseFood(appetite);
            wellFed = true;
            System.out.println("Кот " + name + " съел следующее количество еды - " + appetite);
        } else System.out.println("Недостаточно еды.Просьба добавить.");
    }

    // метод учитывающий поле голода
    public void eatHunger (Plate plate) {
        if (hunger <= 0) {
            wellFed = true;
            System.out.println("Кот не голодный");
        } else if (hunger < appetite) {
            plate.decreaseFood(hunger);
            wellFed = true;
            System.out.println("Кот " + name + " съел следующее количество еды - " + hunger + " и теперь сыт.");
        } else if (plate.amountFoodInPlate > appetite){
            plate.decreaseFood(appetite);
            hunger -= appetite;
            System.out.println("Кот " + name + " съел следующее количество еды - " + appetite +
                    "Но для сытости должен съесть еще " + Math.abs(-hunger) + ".");
        } else
            System.out.println("В тарелке мало еды. Просьба добавить!");
    }
}
