package com.intellijide.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    @Test
    void givenThreePersonInfoAfterInFileWritingShouldReturnEntryCount() {


        Contact contact1 = new Contact("Amit", 22, "Nashik", "Maharashtra");
        Contact contact2 = new Contact("Neha", 21, "Pune", "Maharashtra");
        Contact contact3 = new Contact("Raj", 23, "Mumbai", "Maharashtra");

        List<Contact> list = new ArrayList<>();
        list.add(contact1);
        list.add(contact2);
        list.add(contact3);

        AddressBookFileIO addressBook = new AddressBookFileIO(list);
        addressBook.writeData();
        addressBook.readData();
        long count = addressBook.countEntries();
        Assertions.assertEquals(3,count);
    }
}
