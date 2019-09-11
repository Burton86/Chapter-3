package Assignments;

public class NumbersDemo {

    public static void main(String[] args){

        int x = 5;
        int y = 10;
        displayTwiceTheNumber(y, x);
        displayNumberAddFive(y, x);
        displayNumberSquared(y, x);
    }
    public static void displayTwiceTheNumber(int x, int y){
        int x2;
        int y2;

        x2 = x * 2;
        y2 = y * 2;
        System.out.println(x2 + " " + y2);
    }
     public static void displayNumberAddFive(int x, int y){
        int x3;
        int y3;

        x3 = x + 5;
        y3 = y + 5;

         System.out.println(x3 + " " + y3);
     }
     public static void displayNumberSquared(int x, int y){
         int x4;
         int y4;

         x4 = x * 5 * 5;
         y4 = y * 5 * 5;

         System.out.println(x4 + " " + y4);
     }
}
