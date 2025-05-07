package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Maryana!");
        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Гоша", "Петухов", 5);
        Tester tester3 = new Tester("Иннокентий", "Феофанов", 10, "Продвинутый", 80000);

        tester1.work();
        tester2.work("Банковское приложение");
        tester3.work(8, "Интернет-магазин");
        Tester.companyInfo();
    }
}