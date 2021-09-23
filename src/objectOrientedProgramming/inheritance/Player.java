package objectOrientedProgramming.inheritance;

public class Player {

    int life = 100;
    int x;
    int y;

    boolean attack(Player opponent) {

        int diffX = Math.abs(x - opponent.x);
        int diffY = Math.abs(y - opponent.y);

        if(diffX == 0 && diffY == 1) {
            opponent.life -= 10;
        } else if(diffX == 1 && diffY == 0) {
            opponent.life -= 10;
        } else {
            return false;
        }

        return  true;
    }

    boolean move(Direction direction) {
        if(direction == Direction.NORTH) {
            y--;
        } else if (direction == Direction.EAST) {
            x++;
        } else if(direction == Direction.SOUTH) {
            y--;
        } else if(direction == Direction.WEST) {
            x--;
        }
        return  true;
    }
}
