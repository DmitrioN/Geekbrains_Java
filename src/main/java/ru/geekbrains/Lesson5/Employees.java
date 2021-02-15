package ru.geekbrains.Lesson5;

public class Employees {
    private static int ID = 0;
    private static String FIO = "";
    private static String email = "";
    private static String numberPhone = "";
    private static String position= "";
    private static int salary = 0;
    private static int age = 0;

    public Employees(int ID, String FIO, String email, String numberPhone, String position, int salary, int age) {
        this.ID = ID;
        this.FIO = FIO;
        this.email = email;
        this.numberPhone = numberPhone;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void info() {
        System.out.println("ФИО - " + FIO + "\n" + "Email - " + email + "\n" + "Номер телефона " + numberPhone + "\n"
                           + "Должность -" + position + "\n" + "Зарплата - " + salary + "\n" + "Возраст - " + age);
    }
}
