package classesAndMethods.eatingChallenge;

public class Dinner {
    public static void main(String[] args) {
        Person a = new Person("Pedro", 105);
        Food f = new Food("Steak", 0.5);
        System.out.println(a.weight);
        a.eat(f);
        System.out.println(a.weight);
    }
}
