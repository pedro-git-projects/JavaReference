package foundations;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Nice to meet you, " + name + ".");

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.printf("You are %d years old", age);

        input.close();

    }
}
