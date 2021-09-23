package foundations;

public class PrimitiveVsObject {
    public static void main(String[] args) {
        String s = "String is a class, this is an object.";
        System.out.println(s);

        String str = new String("You can also instantiate the class String as you do with objects.");
        System.out.println(str);

        // We can use wrappers to use class versions of our primitive types

        Byte b = 100;
        Short shrt = 1000;

        Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(shrt.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");


    }
}
