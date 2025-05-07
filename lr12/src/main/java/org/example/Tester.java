package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester() {
        this("Иван", "Иванов", 1, "Средний", 50000);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Начальный", 30000);
    }

    public void work() {
        System.out.println(name + " тестирует ПО.");
    }

    public void work(String project) {
        System.out.println(name + " тестирует проект: " + project);
    }

    public void work(int hours, String project) {
        System.out.println(name + " работал " + hours + " часов над проектом: " + project);
    }

    public static void companyInfo() {
        System.out.println("Тестировщики работают в IT-компаниях.");
    }
}
