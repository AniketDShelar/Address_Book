package com.intellijide.addressbook;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void writeData() {
        Contact contact1 = new Contact("Amit",22,"Pune","Maharashtra");
        Contact contact2 = new Contact("Akash",23,"Mumbai","Maharashtra");
        Contact contact3 = new Contact("Neha",21,"Nashik","Maharashtra");

        List<Contact> list = new ArrayList<>();
        list.add(contact1);
        list.add(contact2);
        list.add(contact3);

        AddressBook addressBook = new AddressBook();
        addressBook.writeData(list);
        addressBook.readData();
    }

    @Test
    void readData() {

    }
}