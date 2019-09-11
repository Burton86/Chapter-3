package Assignments;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args){

        int numLiters, numCent, numInches = 0, numGallons = 0;
        final int NUM_LITERS_IN_GALLLON;
        final int NUM_CENT_TO_INCHES;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of Liters >>>");
        numLiters = keyboard.nextInt();

        convertLitersToGallons(numLiters, numGallons);

        System.out.println("Enter how many centimeters you have >>>");
        numCent = keyboard.nextInt();

        convertCentToInches(numCent, numInches);

    }
    public static void convertLitersToGallons(int numLiters, int numGallons){

        numGallons = (int) (numLiters * 0.264);

        System.out.println("You have " + numGallons + " Gallons." );
    }
    public static void convertCentToInches(int numCent, int numInches){

        numInches = (int) (numCent * 0.394);

        System.out.println("You have " + numInches + " Inches.");
    }

}
