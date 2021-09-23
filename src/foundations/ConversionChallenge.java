package foundations;

import java.util.Scanner;

public class ConversionChallenge {
    public static void main(String[] args) {
        /*
        *  Program to read three string inputs from the user that represent wage
        *  the wage can be entered using . or , as separators
        *  we will convert the Strings to doubles and make calculations with it
        * */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first wage: ");
        String wage1 = input.nextLine();
        String wage1Dot = wage1.replace(',', '.');

        System.out.println("Enter the second wage: ");
        String wage2 = input.nextLine();
        String wage2Dot = wage2.replace(',', '.');

        System.out.println("Enter the third wage: ");
        String wage3 = input.nextLine();
        String wage3Dot = wage3.replace(',', '.');

        double sum = Double.parseDouble(wage1Dot) + Double.parseDouble(wage2Dot) + Double.parseDouble(wage3Dot);
        double mean = sum / 3;

        System.out.println("The mean is " + mean);


    }
}
