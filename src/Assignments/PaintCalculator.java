package Assignments;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args)
    {
        final int COVERAGE = 350;
        int length, width, height;
        double totalSqFt;
        double paintNeeded;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the room >>> ");
        length = scan.nextInt();

        System.out.println("Enter the width of the room >>> ");
        width = scan.nextInt();

        System.out.println("Enter the height of the room >>> ");
        height = scan.nextInt();

        totalSqFt = (((height * length) * 2) + ((width * height)*2));
        paintNeeded = (totalSqFt /  COVERAGE);

        System.out.println(paintNeeded + " gallons of paint is needed to paint a  " +
                length + " by " + width + "  room that is " + height + " tall. Total SQFT: " +
                totalSqFt);


    }
}
