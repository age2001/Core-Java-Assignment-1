package Day8;

import java.util.Scanner;

class NumAverage {
    private double num1, num2, num3;
    final private Scanner scan = new Scanner(System.in);

    public void getUserNumbers() {
        System.out.print("What is your first number: ");
        num1 = Double.parseDouble(scan.nextLine());

        System.out.print("What is your second number: ");
        num2 = Double.parseDouble(scan.nextLine());

        System.out.print("What is your third number: ");
        num3 = Double.parseDouble(scan.nextLine());
    }

    public void printNumberAverage() {
        System.out.println("The average of the numbers " + num1 + ", " + num2 + ", and " + num3 + " is: " +
                ((num1 + num2 + num3) / 3));
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        NumAverage avg = new NumAverage();
        avg.getUserNumbers();
        avg.printNumberAverage();
    }
}
