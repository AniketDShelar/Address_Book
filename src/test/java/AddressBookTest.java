package test.java;

import main.java.AddressBook;
import main.java.Contact;
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

        AddressBook addressBook = new AddressBook(list);
        addressBook.writeData(AddressBook.IOService.FILE_IO);
        addressBook.readData(AddressBook.IOService.FILE_IO);
        long count = addressBook.countEntries(AddressBook.IOService.FILE_IO);
        Assertions.assertEquals(3, count);
    }
}
