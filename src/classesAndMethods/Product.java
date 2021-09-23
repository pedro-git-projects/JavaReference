package classesAndMethods;

public class Product {

    // static variables can be defined anywhere and are visible for the whole class
    // local variables are visible only in the scope they're defined, and only to what is written after them
    String name;
    double price;
    double discount;

    // A method with the same name of the class and no type is a CONSTRUCTOR
    // We can override the default constructors (which takes no parameters)
    // and create custom constructors, which take parameters
    // once we override the original constructor, it is lost unless we define it again
    Product() {

    }

    // This can be used in non-static methods to reference the object being created
    // we can also pass this as a method to call nested constructors.
    Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }


    double priceWithDiscount() {
        return price * (1 - discount);
    }

    // static methods cannot access instance methods
    // not a good practice
    static void resetAttributes(Product p) {
        p.name = " ";
        p.discount = 0.0;
        p.price = 0.0;
    }

    static void alterPrimitive(int a) {
        a++;
    }
}
