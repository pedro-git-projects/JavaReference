package classesAndMethods;

public class Product {
    // A method with the same name of the class and no type is a CONSTRUCTOR
    // We can override the default constructors (which takes no parameters)
    // and create custom constructors, which take parameters
    // once we override the original constructor, it is lost unless we define it again
    Product() {

    }

    Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    String name;
    double price;
    double discount;

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
