package ru.geekbrains.Lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employees[] EmployeesArray = new Employees[5]; // Вначале объявляем массив объектов
        EmployeesArray[0] = new Employees(1, "Инкин Дмитрий Игоревич", "rankor@mail.ru", "89041767753", "Инженер", 10000, 18); // потом для каждой ячейки массива задаем объект
        EmployeesArray[1] = new Employees(2, "Васильев Иван Геннадьевич", "rankor2@mail.ru", "89041767771", "Ведущий Инженер", 120000, 56);
        EmployeesArray[2] = new Employees(3, "Колокольцев Михаил Степанович", "rankor3@mail.ru", "89041767773", "Аналитик", 50000, 25);
        EmployeesArray[3] = new Employees(4, "Журавлев Леонид Константинович", "rankor4@mail.ru", "89041767775", "Журналист", 60000, 30);
        EmployeesArray[4] = new Employees(5, "Самсонов Петр Лаврентьевич", "rankor5@mail.ru", "89041767778", "Архитектор", 200000, 20);

        for (Employees item : EmployeesArray) {
            if (item.getAge() > 40) item.info();
        }
    }
}
