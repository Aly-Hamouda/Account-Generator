package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcom to Our company");
        System.out.print("First name please: ");
        String firstName = in.nextLine();
        System.out.print("Last name please: ");
        String lastName = in.nextLine();
        Email em1 = new Email(firstName, lastName);

        System.out.println();
        System.out.println(em1.toString());
    }
}
