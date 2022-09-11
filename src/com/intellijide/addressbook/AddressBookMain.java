package com.intellijide.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    static final String FAMILY_ADDRESS_BOOK = "Family Address Book";
    static final String PROFESSIONAL_ADDRESS_BOOK = "Professional Address Book";

    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);
        Map<String,AddressBook> addressBookMap = new HashMap<>();
        AddressBook familyAddressBook = new AddressBook();
        AddressBook professionalAddressBook = new AddressBook();
        ArrayList<AddressBook> addressBookList = new ArrayList<>();
        do{
            System.out.println("Enter 1 to Add Family contact\nEnter 2 to Add Professinal contact\nEnter 3 to Edit contact\nEnter 4 to Delete contact\nEnter 5 to get list by city\nEnter 0 to Exit");
            userInput = scan.nextInt();
            switch (userInput){
                case 1:
                    familyAddressBook.addContacts();
                    System.out.println(familyAddressBook.contactList);
                    System.out.println();
                    break;
                case 2:
                    professionalAddressBook.addContacts();
                    System.out.println(professionalAddressBook.contactList);
                    System.out.println();
                case 3:
                    familyAddressBook.editContacts();
                    System.out.println(familyAddressBook.contactList);
                    System.out.println();
                    break;
                case 4:
                    familyAddressBook.deleteContacts();
                    System.out.println(familyAddressBook.contactList);
                    break;
                case 5:
                    System.out.println("Enter Name of City: ");
                    String city = scan.next();
                    familyAddressBook.getPersonNameByCity(city);
                    break;
                default:
                    System.out.println("Exited from Address Book");
            }
        }
        while(userInput != 0);

        addressBookMap.put(FAMILY_ADDRESS_BOOK, familyAddressBook);
        addressBookMap.put(PROFESSIONAL_ADDRESS_BOOK, professionalAddressBook);

        addressBookList.add(familyAddressBook);
        addressBookList.add(professionalAddressBook);

        System.out.println(addressBookList);
        System.out.println(addressBookMap.toString());

    }
}
