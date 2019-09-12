package Assignments;
import java.util.Scanner;

public class PaintCalculator {
    static int NumRoom;
    static int PaintPrice;
    static int NumSqtft;

    public static void main(String[] args)
    {
        final int COVERAGE = 400;
        final int DOOR = 20;
        final int WINDOW = 15;
        int length, width, height, doors, windows;
        double totalSqFt;
        double paintNeeded;
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the length of the room: ");
        length = scan.nextInt();

        System.out.println("Enter the width: ");
        width = scan.nextInt();

        System.out.println("Enter the height: ");
        height = scan.nextInt();

        System.out.println("Enter the number of doors: ");
        doors = scan.nextInt();

        System.out.println("Enter the number of windows: ");
        windows = scan.nextInt();

        totalSqFt = 2 * width * height + 2 * length * height - DOOR*doors - WINDOW*windows;
        paintNeeded = totalSqFt / COVERAGE;

        System.out.println("Length= " + length + "\nWidth= " + width +  "\nHeight= " + height + "\nNumber of doors: " +
                doors + "\nNumber of windows: " + windows + "\nGallons of Paint Needed= " + paintNeeded);

    }
}