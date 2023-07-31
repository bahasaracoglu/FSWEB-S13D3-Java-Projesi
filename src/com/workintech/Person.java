package com.workintech;

import java.util.logging.StreamHandler;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String nationality;
    private String job;
    private String[] hobbies;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String gender, String nationality) {

        this(firstname, lastname, age);
        this.gender = gender;
        this.nationality = nationality;

    }

    public Person(String firstname, String lastname, int age, String gender, String nationality, String job, String[] hobbies) {
        this(firstname, lastname, age,gender,nationality);
        this.job = job;
        this.hobbies = hobbies;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+firstname+ " Lastname: "+ lastname);
        return sb.toString();
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {

        return age>=13&&age<=19?true:false;
    }


}
