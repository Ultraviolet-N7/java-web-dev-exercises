package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rectangle length: ");
        int rectangleLength = input.nextInt();
        System.out.println("Please enter the rectangle width: ");
        int rectangleWidth = input.nextInt();
        int rectangleArea = rectangleWidth * rectangleLength;
        System.out.println("The area of the rectangle is " + rectangleArea);
    }
}
