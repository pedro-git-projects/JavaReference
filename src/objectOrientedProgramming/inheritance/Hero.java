package objectOrientedProgramming.inheritance;

public class Hero extends  Player {

    // We overridden the attack method inherited from the player class

//    boolean attack(Player opponent) {
//
//        int diffX = Math.abs(x - opponent.x);
//        int diffY = Math.abs(y - opponent.y);
//
//        if(diffX == 0 && diffY == 1) {
//            opponent.life -= 20;
//        } else if(diffX == 1 && diffY == 0) {
//            opponent.life -= 20;
//        } else {
//            return false;
//        }
//
//        return  true;
//    }

    boolean attack(Player opponent) {
        // super.attack means we're calling the method attack in the super class (Player)
        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        return  attack1 || attack2;
    }
}
