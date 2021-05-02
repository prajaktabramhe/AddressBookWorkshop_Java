package com.bridgelabz.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookTest
{

    @Test
    public  void givenContact_WhenAddedToAddressBook_ShouldReturnTrue()
    {
      AddressBookMain addressBookMain = new AddressBookMain();
      AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", "Ashtyavinayak colony", "Nagpur", "MH", "440034", "8149240833", "prajkat@gmail.com");
      HashMap<String,List<AddressBookDetails>>  addressBookDetailsList = addressBookMain.addContact("Family", addressBookDetails);
      Assertions.assertEquals(1, addressBookDetailsList.get("Family").size());
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_true()
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookDetails contact = new AddressBookDetails("Prajakta", "Bramhe", "Ashtyavinayak colony", "Nagpur", "MH", "440034", "8149240833", "prajkat@gmail.com");
        HashMap<String, List<AddressBookDetails>> contactList = addressBookMain.addContact("Family", contact);
        boolean result = addressBookMain.updateContact(contactList, "Family", "Prajakta", "address", "Abhyankara Nagar");
        Assertions.assertTrue(result);
    }

  @Test
    public void givenContactName_whenDeleted_ShouldReturn_true()
  {
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", "Lakshmi Nagar", "Nagpur", "MH", "440034", "8149240833", "prajakta14@gmail.com");
        HashMap<String, List<AddressBookDetails>> addressBookDetailsList = addressBookMain.addContact("Family", addressBookDetails);
        boolean result = addressBookMain.deleteContact(addressBookDetailsList, "Family", "Prajakta");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenListOfContacts_whenAdded_ShouldReturn_true()
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        List<AddressBookDetails> addressBookDetailsList = new ArrayList<>();
        addressBookDetailsList.add(new AddressBookDetails("Prajakta", "Bramhe", " Ashtyavinayak Colony", "Napur", " MH", "440034", "8149240833", "prajakta@gmail.com"));
        addressBookDetailsList.add(new AddressBookDetails("Payal", "Shende", "Rukmini Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com"));
        addressBookDetailsList.add(new AddressBookDetails("Ekta", "Shende", "GopalNagar", "Wardha", "MH", "442001", "8794569789", "ektashende12@gmail.com"));
        addressBookDetailsList.add(new AddressBookDetails("Neha", "Zade", "Gajanan Nagar", "Wardha", "MH", "442001", "9745073856", "neha.zade@gmail.com"));
        HashMap<String, List<AddressBookDetails>> contactList = addressBookMain.addContactList("Family", addressBookDetailsList);
        Assertions.assertEquals(4, contactList.get("Family").size());
    }
    @Test
    public void whenNewAddressBookCreated_ShouldReturn_true()
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        HashMap<String, List<AddressBookDetails>> addressBookList = addressBookMain.createNewAddAddressBook("Friends");
        Assertions.assertTrue(addressBookList.containsKey("Friends"));

    }


}
