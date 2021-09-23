package objectOrientedProgramming.inheritance;

public class Game {
    public static void main(String[] args) {

        // As Hero extends player, everything keeps working!
        Hero hero = new Hero();
        hero.x = 10;
        hero.y = 10;

        Goblin goblin = new Goblin();
        goblin.x = 10;
        goblin.y = 11;

        System.out.println("The hero has => " + hero.life + "hp.");
        System.out.println("The goblin has => " + goblin.life + "hp.");

        hero.attack(goblin);

        System.out.println("The goblin has => " + goblin.life + "hp.");
        System.out.println("The hero has => " + hero.life + "hp.");

        goblin.attack(hero);

        hero.move(Direction.NORTH);
        hero.move(Direction.NORTH);

        // Won't work since they're not side by side
        hero.attack(goblin);
        System.out.println("The hero has => " + hero.life + "hp.");
        System.out.println("The goblin has => " + goblin.life + "hp.");
    }
}
