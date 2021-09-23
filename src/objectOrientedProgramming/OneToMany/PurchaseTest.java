package objectOrientedProgramming.OneToMany;

public class PurchaseTest {
    public static void main(String[] args) {
        Purchase p1 = new Purchase();
        p1.user = "Pedrão";
        // could add items directly using p1.items.add("");

        p1.items.add(new Item("Eraser", 2, 1));
        p1.items.add(new Item("Pen", 10, 5));
        p1.items.add(new Item("Notebook", 6, 15));

        System.out.println(p1.items.size());
        System.out.println(p1.getTotal());
    }

}
