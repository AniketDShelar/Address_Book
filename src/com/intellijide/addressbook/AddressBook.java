package com.intellijide.addressbook;

import java.util.*;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();
    void addContacts() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name -> ");
        String name = scan.next();
        System.out.println("Enter age -> ");
        int age = scan.nextInt();
        System.out.println("Enter city -> ");
        String city = scan.next();
        System.out.println("Enter state -> ");
        String state = scan.next();
        Contact contact = new Contact();
        contact.setName(name);
        contact.setAge(age);
        contact.setCity(city);
        contact.setState(state);

        contactList.add(contact);
    }
    void editContacts(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of person to edit -> ");
        String pName = scan.next();
        for(Contact contact : contactList){
            if(contact.getName().equals(pName)){
                System.out.println("Enter name -> ");
                String name = scan.next();
                System.out.println("Enter age -> ");
                int age = scan.nextInt();
                System.out.println("Enter city -> ");
                String city = scan.next();
                System.out.println("Enter state -> ");
                String state = scan.next();

                contact.setName(name);
                contact.setAge(age);
                contact.setCity(city);
                contact.setState(state);
            }
        }
    }
    void deleteContacts(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of person to Delete -> ");
        String pName = scan.next();
        for(Contact contact : contactList){
            if(contact.getName().equals(pName)){
                contactList.remove(contact);
            }
        }
    }
}
