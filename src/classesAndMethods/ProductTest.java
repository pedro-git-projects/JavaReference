package classesAndMethods;

public class ProductTest {
    public static void main(String[] args) {
        // I don't need to import Product because they're inside the same package
        // A class defines a type
        // new is what calls the constructor of a Class

        Product p1 = new Product("Jackson 7 string guitar", 5000.00, 0.05);
        var p2 = new Product(); // Inferred type

        p2.name = "Fender Precision Bass";
        p2.price = 3500.00;
        p2.discount = 0.1;

        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.discount);
        double finalPrice1 = p1.price * (1 - p1.discount);
        double finalPrice2 = p2.price * (1 - p2.discount);
        System.out.printf("The final price of p1 is %.2f, and of p2 is %.2f \n", finalPrice1, finalPrice2);

        // now using a method defined inside the class
        System.out.println(p2.priceWithDiscount());
    }
}
