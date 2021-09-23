package objectOrientedProgramming.OneToMany;

import java.util.ArrayList;

public class Purchase {

    // A purchase has many items
    String user;
    ArrayList<Item> items = new ArrayList<Item>();


    double getTotal() {
        double total = 0;
        for(Item item: items){
            total += item.quantity * item.price;
        }
        return total;
    }
}
