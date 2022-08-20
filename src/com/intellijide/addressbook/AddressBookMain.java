package com.intellijide.addressbook;

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
        do{
            System.out.println("Enter 1 to Add contact\nEnter 2 to Edit contact\nEnter 3 to Delete contact");
            userInput = scan.nextInt();
            switch (userInput){
                case 1:
                    familyAddressBook.addContacts();
                    System.out.println(familyAddressBook.contactList);
                    break;
                case 2:
                    familyAddressBook.editContacts();
                    System.out.println(familyAddressBook.contactList);
                    break;
                case 3:
                    familyAddressBook.deleteContacts();
                    System.out.println(familyAddressBook.contactList);
                    break;
                default:
                    System.out.println("Exited from Address Book");
            }
        }
        while(userInput != 0);

//        familyAddressBook.addContacts();
////        System.out.println(familyAddressBook.contactList);
//
//        familyAddressBook.addContacts();
//        familyAddressBook.editContacts();
//        System.out.println(familyAddressBook.contactList);
//
//        professionalAddressBook.addContacts();
//        professionalAddressBook.editContacts();
//        System.out.println(professionalAddressBook.contactList);
//
        addressBookMap.put(FAMILY_ADDRESS_BOOK, familyAddressBook);
        addressBookMap.put(PROFESSIONAL_ADDRESS_BOOK, professionalAddressBook);
    }
}
