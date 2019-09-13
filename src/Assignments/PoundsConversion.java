package Assignments;
import java.util.Scanner;

public class PoundsConversion {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds >>> ");
        double pounds = input.nextDouble();

        poundsToKilos(pounds);
        poundsToOunces(pounds);
        poundsToMilligrams(pounds);
    }
    public static void poundsToKilos(double pounds){


        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
    public static void poundsToOunces(double pounds){
        double ounces = pounds * 16;
        System.out.println(pounds + " pounds is " + ounces + " ounces");
    }
    public static void poundsToMilligrams(double pounds){

        double milligrams = pounds * 453592;
        System.out.println(pounds + " pounds is " + milligrams + " milligrams");
    }
}
