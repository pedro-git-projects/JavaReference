package classesAndMethods;

public class GarbageValues {
    int a;
    float b;
    boolean f;
    char c;
    String s;

    public static void main(String[] args) {

       // byte, short, int, long -> 0
       // float, double -> 0.0
       // boolean -> false
       // char -> '\u0000'

        // Objects -> null
        // null means that this variable doesn't point to any memory location


        GarbageValues g = new GarbageValues();
        System.out.println(g.a + " " + g.b + " " + g.f + " " + g.c + " " + g.s);

        // Note that local variables are not initialized by default,
        // only variables which are defined directly in the body of the class, outside methods,
        // will be assigned garbage values.
    }
}
