package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();

//        if (radius < 0 || radius == " " || ) {
//            System.out.println("This is not a valid number fool!");
//        }

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
