package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();

    }

    public void calculateArea() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:  ");
        try {
            boolean keepLooping = true;
            while(keepLooping) {
                Double radius = input.nextDouble();

                if (radius < 0) {
                    System.out.println("Input must be a positive number. Please try again: ");
                } else {
                    keepLooping = false;
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                }
            }
            } catch(Exception error) {
            System.out.println("Input must be numeric.");
        }

        input.close();

    }
}
