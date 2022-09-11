package com.intellijide.addressbook;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {
    Map<String, AddressBook> addressBookListMap = new HashMap<>();
    public static HashMap<String, ArrayList<Contact>> personByState;
    public static HashMap<String, ArrayList<Contact>> personByCity;
    ArrayList<Contact> contactList = new ArrayList<>();
    public void addContacts() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name -> ");
        String name = scan.next();
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                System.out.println("This name is already there in AddressBook");
                addContacts();
            }
        }
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
                System.out.println("Enter state -> " );
                String state = scan.next();

                contact.setName(name);
                contact.setAge(age);
                contact.setCity(city);
                contact.setState(state);
            }
        }
    }
    public void searchPersonNameByCity(String city) {
        for (Map.Entry<String, AddressBook> entry : addressBookListMap.entrySet()) {
            AddressBook value = entry.getValue();
            System.out.println("The Address Book: " + entry.getKey());
            value.getPersonNameByCity(city);
        }
    }
    private void searchPersonByState(String stateName) {
        for (Map.Entry<String, AddressBook> entry : addressBookListMap.entrySet()) {
            AddressBook value = entry.getValue();
            System.out.println("The Address Book: " + entry.getKey());
            value.getPersonNameByState(stateName);
        }
    }
        public void getPersonNameByCity (String city){
        List<Contact> list = contactList.stream().filter(contactName -> contactName.getCity().equals(city))
                .collect(Collectors.toList());
        for (Contact contact : list) {
            System.out.println("Name: " + contact.getName());
            }
        }
    public void getPersonNameByState(String State) {
        List<Contact> list = contactList.stream().filter(contactName -> contactName.getState().equals(State))
                .collect(Collectors.toList());
        for (Contact contact : list) {
            System.out.println("First Name: " + contact.getName());
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

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBookListMap=" + addressBookListMap +
                ", contactList=" + contactList +
                '}';
    }
}
