package com.addressbokkjdbc;

import java.util.Scanner;
public class AddressBookMain {
    public static Scanner scanner = new Scanner(System.in);
    public static void operations(){
        DatabaseConnection connection = new DatabaseConnection();

        String flag;

        while (true) {
            System.out.println(" ---- Address Book Menu ----\n");
            System.out.println(" 1. Display data from database\n"
                    + " 2. Update contact in database\n 3. Exit");
            System.out.print("\n Please enter your choice: ");
            flag = scanner.next();

            switch (flag) {
                //Displaying the data from database
                case "1": connection.displayDetails();
                    break;
                //Update the contact number of the person in database
                case "2":
                    System.out.print("Enter first name: ");
                    String fName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lName = scanner.next();
                    System.out.print("Enter the new phone number: ");
                    int newPhone = scanner.nextInt();

                    connection.updateContact(fName,lName,newPhone);
                    break;
                case "3":                                               // Exit the program
                    System.out.println(" Thank you!");
                    return;

                default:                                                 // If in case the user enters invalid choice
                    System.out.println(" Please enter a valid choice: ");
            }
        }
    }
    public static void main(String[] args){
        System.out.println(" Welcome to the Address Book Program in Java");
        operations();
    }
}


