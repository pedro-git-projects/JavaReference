package classesAndMethods;

public class NullValue {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("Will execute just fine"));

        // String s2 = null;
        // System.out.println(s2.concat("Null pointer exception!"));
        // Null pointer exception is what happens when you try to access a method or attribute of a null variable
        // for it points not to any memory location

        // Product d1;
        // System.out.println(d1.name);
    }
}
