package com.intellijide.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("welcome to Address Book Program");
        Scanner scan = new Scanner(System.in);
        AddressBookMain abm = new AddressBookMain();
        abm.personDetails();
        System.out.println();
    }
    void personDetails(){
        System.out.println("Enter first and last name -> ");
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.println("Enter Address -> ");
        String address = scan.next();
        System.out.println("Enter State -> ");
        String state = scan.next();
        System.out.println("Enter city -> ");
        String city = scan.next();
        System.out.println("Enter zipcode -> ");
        String zip = scan.next();
        System.out.println("Enter phone number -> ");
        String phoneNumber= scan.next();

        System.out.println("-----Details of person-----");
        System.out.println("Name -> " +firstName+ " " +lastName);
        System.out.println("Address -> " +address);
        System.out.println("state -> " +state);
        System.out.println("city -> " +city);
        System.out.println("zip code -> " +zip);
        System.out.println("Phone Number -> " +phoneNumber);

        System.out.println("Enter 1 to Add Details of new person");
        System.out.println("Enter 2 to exit");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                personDetails();
                break;
            case 2:
                System.out.println("Exited from Address book");
        }
    }
}
