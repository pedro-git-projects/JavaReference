package classesAndMethods;

public class DetelChallenge {

    // The goal is to fix this code by altering only what lies inside the main method
    // outside: int a = 3;
    // inside: System.out.println(a);
    int a  = 3;

    public static void main(String[] args) {
        /*
        * Solution: When inside main, we're inside a STATIC method,
        * that is it belong to the DetelChallenge Class, NOT an instance.
        * however, attribute a belongs to an INSTANCE.
        * Static methods can't access instance methods and instance variables directly.
        * They must use reference to object.
        * This means we have to CONSTRUCT the object.
        * */
        DetelChallenge d = new DetelChallenge(); //creating an INSTANCE of the DetelChallenge Class
        System.out.println(d.a);
    }
}
