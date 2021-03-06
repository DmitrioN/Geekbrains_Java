package ru.geekbrains.lesson7;

public class Lesson7 {
    public static void main(String[] args) {

    //создаем экземпляр тарелки (количество еды, вместимость тары)
    Plate plate = new Plate (100, 100);

    //создаем массив с котами
    Cats[] catsList = {
            new Cats("Cat1", 10),
            new Cats("Cat2", 10),
            new Cats("Cat3", 30, 20),
            new Cats("Cat4", 20,50)
    };

    // Проверяем голоден ли кот, а также количество оставшейся еды
    catsList[0].catInfo();
    catsList[0].eat(plate);
    catsList[0].catInfo();
    plate.plateInfo();
    System.out.println();

    // Даем еды 2 котам, проверяем количетсво оставшейся еды
    catsList[1].eat(plate);
    catsList[2].eat(plate);
    plate.plateInfo();
    System.out.println();

    // Даем еды 4- му коту, проверяем работу методов addFood и eatHunger
    catsList[3].catInfo();
    catsList[3].eatHunger(plate);
    plate.addFood(40);
    catsList[3].eatHunger(plate);
    catsList[3].eatHunger(plate);
    catsList[3].catInfo();

   }
}
