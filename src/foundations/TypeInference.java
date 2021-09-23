package foundations;

public class TypeInference {
    public static void main(String[] args) {
        double a = 6.9;
        System.out.println(a);

        // When declaring variables, the word var Java infers its value
        var b = 4.5;
        System.out.println(b);

        var c = "Text";
        System.out.println(c);

        // We can change the value, if it respects the inferred type!
        c = "New text";
        System.out.println(c);

        // However, as Java is statically typed, we can't change variable types.
        // c = 9; will error out

        // Declared
        double d;
        // Initialized
        d = 456.123;
        System.out.println(d);

        // Inferred variables MUST be simultaneously declared and initialized
        var e = "var e; will error out, for the compiler can't infer it's type";
        System.out.println(e);
    }
}
