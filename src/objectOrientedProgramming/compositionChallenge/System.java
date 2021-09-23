package objectOrientedProgramming.compositionChallenge;

public class System {
    public static void main(String[] args) {
        User user = new User("Pedro");

        Product p = new Product("Pen", 4.50);

        Item i = new Item(p, 12 );

        Purchase p1 = new Purchase();
        p1.addItem(i);

        java.lang.System.out.println(p1.getTotal());


    }
}
