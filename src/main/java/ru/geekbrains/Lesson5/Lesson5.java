package ru.geekbrains.Lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5]; // Вначале объявляем массив объектов
        employeesArray[0] = new Employee(1, "Инкин Дмитрий Игоревич", "rankor@mail.ru", "89041767753", "Инженер", 10000, 18); // потом для каждой ячейки массива задаем объект
        employeesArray[1] = new Employee(2, "Васильев Иван Геннадьевич", "rankor2@mail.ru", "89041767771", "Ведущий Инженер", 120000, 56);
        employeesArray[2] = new Employee(3, "Колокольцев Михаил Степанович", "rankor3@mail.ru", "89041767773", "Аналитик", 50000, 25);
        employeesArray[3] = new Employee(4, "Журавлев Леонид Константинович", "rankor4@mail.ru", "89041767775", "Журналист", 60000, 30);
        employeesArray[4] = new Employee(5, "Самсонов Петр Лаврентьевич", "rankor5@mail.ru", "89041767778", "Архитектор", 200000, 20);


        for (Employee item : employeesArray) {
            if (item.getAge() > 40) item.info();
        }
    }
}
