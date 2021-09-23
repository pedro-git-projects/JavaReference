package classesAndMethods;

public class PassByValuePassByReference {

    public static void main(String[] args) {
        // As a and b are primitive types, we're passing by value
        // that is, copying the value to another memory location

        int a = 0;
        int b = a;

        a++;
        b--;

        System.out.println(a + " "  + b);

        Product p1 = new Product("Pen", 0.50, 0.0);
        Product p2 = p1; // pass by reference

        p1.price = 0.60;
        p2.price = 0.20;

        // both variables are mutated, for they are actually references for memory location
        System.out.println(p1.price + " " + p2.price);

        Product.resetAttributes(p1);
        System.out.println(p1.name + " " + p1.price + " " + p1.discount);
        System.out.println(p1.name + " " + p1.price + " " + p1.discount);

        // note that as we passed by reference, both objects were altered.

        // As primitves are passed by copy, only a is incremented
        Product.alterPrimitive(a);
        System.out.println(a + " " + b);
    }
}
