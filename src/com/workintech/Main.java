package com.workintech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("John", "Doe", 20);
        Person person2 = new Person("Baha", "Saracoglu", 29);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
    }
}