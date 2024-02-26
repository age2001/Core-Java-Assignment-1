package Day8;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    final private Scanner scan = new Scanner(System.in);

    public void askUserForLenHgt() {
        System.out.print("Enter the length of the rectangle: ");
        length = scan.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scan.nextDouble();
    }

    public void printRectangleArea() {
        // Removing decimal by type casting to int
        System.out.println("Rectangle Area: " + (int) (length * width));
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.askUserForLenHgt();
        rect.printRectangleArea();
    }
}
