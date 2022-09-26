package main.java;

import java.util.List;

public class AddressBook {

    public enum IOService{
        FILE_IO, OPEN_CSV_IO,GSON
    }
    List<Contact> contactList;

    public AddressBook(List<Contact> contactList) {
        this.contactList = contactList;
    }
    public AddressBookInterface getAddressBookObject(IOService ioType){
        AddressBookInterface addressBookInterface = null;
        if(IOService.FILE_IO.equals(ioType)){
            addressBookInterface = new AddressBookFileIO();
        }else{
            addressBookInterface = new AddressBookGson();
        }
        return addressBookInterface;
    }
    public void writeData(IOService ioType) {
        AddressBookInterface addressBookInterface = getAddressBookObject(ioType);
        addressBookInterface.writeData(contactList);
    }
    public void readData(IOService ioType) {
        AddressBookInterface addressBookInterface = getAddressBookObject(ioType);
        addressBookInterface.readData();
    }
    public long countEntries(IOService ioType) {
        AddressBookInterface addressBookInterface = getAddressBookObject(ioType);
        return addressBookInterface.countEntries();
    }
}
