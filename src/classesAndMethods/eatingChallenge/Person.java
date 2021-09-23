package classesAndMethods.eatingChallenge;

public class Person {

    String name;
    Double weight;

    Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat(Food f) {
        this.weight = f.weight + this.weight;
    }
}
