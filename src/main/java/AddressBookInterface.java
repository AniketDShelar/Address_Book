package main.java;

import java.util.List;

public interface AddressBookInterface {
    public void writeData(List<Contact> contactList);
    public void readData();
    public long countEntries();
}
