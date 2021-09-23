package objectOrientedProgramming.compositionChallenge;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        this.items.add(item);
    }

    double getTotal() {
        // Creating and initializing the variable total
        double total = 0;
        // Traversing an array trough a for loop
        for(Item item: items) {
            total += item.amount * item.product.price;
        }
        return total;
    }
}
