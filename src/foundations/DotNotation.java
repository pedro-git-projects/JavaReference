package foundations;

public class DotNotation {
    public static void main(String[] args) {

        String s = "Greetings X";
        s = s.replace("X", "m'lady");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Pedro".toUpperCase();
        System.out.println(x);

        String y = "Good morning, X"
                .replace("X", "Tati")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Primitive types have no associated methods that can be accessed trough "."
        int a = 3;
        System.out.println(a);
    }
}
