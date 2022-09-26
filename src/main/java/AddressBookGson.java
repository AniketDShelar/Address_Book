package main.java;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddressBookGson implements AddressBookInterface{
    static AddressBook addressBook;
    final String FILE_PATH = "C:\\Users\\Admin\\eclipse-workspace\\Address_Book\\src\\main\\java\\AddressBookFile.json";
    Gson gson = new Gson();

    @Override
    public void writeData(List<Contact> contactList){
        String json = gson.toJson(contactList);
        FileWriter writer;

        {
            try {
                writer = new FileWriter(FILE_PATH);
                writer.write(json);
                writer.close();
            } catch (IOException e) {
                System.out.println(" : " +e);
            }
        }
    }
    @Override
    public void readData(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            Contact contact = new Contact();
            contact = gson.fromJson(bufferedReader,Contact.class);
            System.out.println("Contact Name : " +contact.getName());
            System.out.println("Contact Age : " +contact.getAge());
            System.out.println("Contact City : " +contact.getCity());
            System.out.println("Contact State : " +contact.getState());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public long countEntries() {

        return 0;
    }
}
