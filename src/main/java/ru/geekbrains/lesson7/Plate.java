package ru.geekbrains.lesson7;

public class Plate {
    int amountFoodInPlate; // текущее количество еды в тарелке
    int maxAmountFood;    // максимальное количество еды в тарелке

    public Plate (int food, int capacity) {
        this.amountFoodInPlate = food;
        this.maxAmountFood = capacity;
    }

    //проверяем количество съеденной еды, если недостаточно
    public void decreaseFood(int appetite) {
        if (amountFoodInPlate > appetite) {
            amountFoodInPlate -= appetite;
        }
    }

    // количестве еды в тарелке
    public void plateInfo () {
        System.out.println("В тарелке осталось " + amountFoodInPlate + " еды.");
    }

    // делаем максимальное количество еды
    public void refillPlate () {
        amountFoodInPlate = maxAmountFood;
        System.out.println("Тарелка заплнена. Теперь в ней " + amountFoodInPlate + " еды.");
    }

    // восполняет количество еды учитывыя максимальную вместимость тарелки
    public void addFood (int add) {
        int foodAmount = amountFoodInPlate + add;

        if (foodAmount > maxAmountFood) {
            foodAmount = maxAmountFood;
        }

        amountFoodInPlate = foodAmount;
    }
}
