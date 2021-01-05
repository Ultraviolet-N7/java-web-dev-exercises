package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter the number of miles driven: ");
        int miles = input.nextInt();
        System.out.println("Please enter the amount of gas consumed: ");
        int gas = input.nextInt();
        int milesPerGallon = miles * gas;
        System.out.println("You are getting " + milesPerGallon + " miles per gallon.");
    }
}
