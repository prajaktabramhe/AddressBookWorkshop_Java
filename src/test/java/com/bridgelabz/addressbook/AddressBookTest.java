package com.bridgelabz.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTest
{
    @Test
    public  void givenContact_WhenAddedToAddressBook_ShouldReturnTrue()
    {
      AddressBookMain addressBookMain = new AddressBookMain();
      AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", "Ashtyavinayak colony", "Nagpur", "MH", "440034", "8149240833", "Prajkat@gmail.com");

        List<AddressBookDetails> addressBookDetailsList = addressBookMain.addContact(addressBookDetails);
      Assertions.assertEquals(1, addressBookDetailsList.size());
    }

    @Test
    public  void givenContactName_whenUpdated_shoouldReturn_TRUE()
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", " Ashtyavinayak Colony", "Napur", " MH", "440034", "8149240833", "prajakta@gmail.com");
        List<AddressBookDetails> addressBookDetailsList = addressBookMain.addContact(addressBookDetails);
        AddressBookDetails updateContact = addressBookMain.updateContact(addressBookDetailsList, "Prajakta", "address", "Ganesh colony");
        Assertions.assertEquals("Ganesh colony", updateContact.address);
    }

    @Test
    public void givenContactName_whenDeleted_ShouldReturn_true()
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", "Lakshmi Nagar", "Nagpur", "MH", "440034", "8149240833", "prajakta14@gmail.com");
        List<AddressBookDetails> addressBookDetailsList = addressBookMain.addContact(addressBookDetails);
        List<AddressBookDetails> deleteContactList = addressBookMain.deleteContact(addressBookDetailsList, "Prajakta");
        Assertions.assertEquals(0, deleteContactList.size());
    }
}
