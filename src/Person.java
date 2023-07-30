import java.util.logging.StreamHandler;

public class Person {
    String firstname;
    String lastname;
    int age;
    String gender;
    String nationality;
    String job;
    String[] hobbies;

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


}
