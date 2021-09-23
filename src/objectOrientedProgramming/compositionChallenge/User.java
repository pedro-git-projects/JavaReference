package objectOrientedProgramming.compositionChallenge;

import objectOrientedProgramming.OneToMany.Item;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;
    List<Purchase> purchases = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

}
