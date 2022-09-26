package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AddressBookFileIO implements AddressBookInterface {
    final String FILE_PATH = "C:\\Users\\Admin\\eclipse-workspace\\Address_Book\\src\\main\\java\\addressbookfile.txt";


    @Override
    public void writeData(List<Contact> contactList) {
        StringBuffer contactBuffer = new StringBuffer();
        contactList.forEach(empData -> {
            String contactString = empData.toString().concat("\n");
            contactBuffer.append(contactString);
        });
        try {
            Files.write(Path.of(FILE_PATH), contactBuffer.toString().getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void readData() {
        try {
            Files.lines(Path.of(FILE_PATH)).forEach(x -> System.out.println(x));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public long countEntries() {
        try {
            return Files.lines(Path.of(FILE_PATH)).count();
        } catch (IOException e) {
            System.out.println(e);
        }
        return 0;
    }
}