package Day8;

import java.util.Scanner;

class User {
    private String name;
    private int rollNumber;
    private String fieldOfInterest;
    final private Scanner scan = new Scanner (System.in);

    public void getUserInfo() {
        System.out.print("What is your First name: ");
        name = scan.nextLine();

        /* Using Integer.parseInt as using scan.nextInt() does not interpret pressing enter correctly for the
           following scan.nextLine
        * */
        System.out.print("What is your roll number: ");
        rollNumber = Integer.parseInt(scan.nextLine());

        System.out.print("What is your field of interest: ");
        fieldOfInterest = scan.nextLine();
    }

    public void printUserInfo() {
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". "
                            + "My field of interest is " + fieldOfInterest + ".");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        User user = new User();
        user.getUserInfo();
        user.printUserInfo();
    }
}
