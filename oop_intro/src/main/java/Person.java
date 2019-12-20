/**
 * Clasa Persoana
 */

public class Person {
    String name; //attribute or instance variable (variabila de instanta)
    int age = 0;

    // constructor implicit
    public Person() {

        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    // constructor explicit
    public Person(String name) {
        System.out.println("Constructorul explucit cu 1 parametru a fost apelat");
        this.name = name;
    }
}
