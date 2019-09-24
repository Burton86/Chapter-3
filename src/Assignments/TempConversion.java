package Assignments;
import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 temperatures in Fahrenheit at 3 different hours in the day >>>");
        temperature = in.nextInt();
        temperature = ((temperature - 32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);

        if (temperature <= 32) {
            System.out.println("It is freezing out side");
        }
        if (temperature >= 100) {
            System.out.println("It is very hot out side");
        }
    }
}
