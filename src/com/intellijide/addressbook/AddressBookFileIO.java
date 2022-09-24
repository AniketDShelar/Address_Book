package com.intellijide.addressbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AddressBookFileIO {
    final String FILE_PATH = "C:\\Users\\Admin\\eclipse-workspace\\Address_Book\\src\\com\\intellijide\\addressbook\\addressbookfile.txt";
    private final List<Contact> contactList;

    public AddressBookFileIO(List<Contact> contactList) {
        this.contactList = contactList;
    }
    public void writeData() {
        StringBuffer employeeBuffer = new StringBuffer();
        contactList.forEach(empData ->{
            String empString = empData.toString().concat("\n");
            employeeBuffer.append(empString);
        });
        try {
            Files.write(Path.of(FILE_PATH),employeeBuffer.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readData() {
        try {
            Files.lines(Path.of(FILE_PATH)).forEach(x -> System.out.println(x));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public long countEntries() {
        try {
            return Files.lines(Path.of(FILE_PATH)).count();
        } catch (IOException e) {
            System.out.println(e);
        }
        return 0;
    }
}