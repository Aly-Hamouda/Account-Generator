package emailapp;
import java.util.Random;
import java.util.Scanner;

public class Email {
    //attributes
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int defaultPasswordLenght = 10;
    private int mailBoxCapacity = 500;
    private String companySuffix = "ytsCo.com";

    //Constructor to recieve first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Calling a method to asking for the department ~ and return it
        department = setDepartment();

        // Calling a method that generate a random password
        password = generatePassword(defaultPasswordLenght);

        //Combine elements to generate E-mail
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this. department+"."+companySuffix;

        System.out.println("Email successfully created:");
        System.out.println("Your Email is: "+ email);
        System.out.println("Your password is: "+password);

    }

    //Ask for the department
    private String setDepartment() {
        Scanner in = new Scanner(System.in);
        System.out.print("Department Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        int input = in.nextInt();
        if (input == 1){return"Sales";}
        else if (input == 2){return "Dev";}
        else if (input == 3){return "Acc";}
        else {return " ";}
    }

    //Generate a random Password
    private String generatePassword(int length){
        String passwordCharcters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#!$%";
        /* --> my way to generate random Pass
        Random rand = new Random();
        String actualPass = "";

        for (int i = 0;i<length ;i++ ) {
            int randomNumber = rand.nextInt(passwordCharcters.length());
            char c = passwordCharcters.charAt(randomNumber);
            actualPass +=c;
        }
        return actualPass;
        */

        // --> video way to generate random Pass
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordCharcters.length());
            password[i] = passwordCharcters.charAt(rand);
        }
        return new String (password);
    }

    //Set mailBox Capacity
    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    //Set alternate Email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change The Password
    public void setNewPassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity()   { return this.mailBoxCapacity; }
    public String getAlternateEmail() { return this.alternateEmail; }
    public String getPassword()       { return this.password; }

    //Display name & Email & MailBox Capacity

    @Override
    public String toString() {
        return "Email: \n" +
                "firstName= " + firstName + '\n' +
                "lastName=" + lastName + '\n' +
                "email=" + email + '\n' +
                "mailBoxCapacity=" + mailBoxCapacity;
    }
}
