package ru.geekbrains.Lesson5;

public class Employee {
    private static int ID = 0;
    private static String FIO = "";
    private static String email = "";
    private static String numberPhone = "";
    private static String position= "";
    private static int salary = 0;
    private static int age = 0;

    public Employee(int ID, String FIO, String email, String numberPhone, String position, int salary, int age) {
        ID = ID;
        FIO = FIO;
        email = email;
        numberPhone = numberPhone;
        position = position;
        salary = salary;
        age = age;
    }

    public int getAge() {
        return age;
    }

    public static void info() {
        System.out.println("ФИО - " + FIO + "\n" + "Email - " + email + "\n" + "Номер телефона " + numberPhone + "\n"
                           + "Должность -" + position + "\n" + "Зарплата - " + salary + "\n" + "Возраст - " + age);
    }
}
