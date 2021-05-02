package com.bridgelabz.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest
{
    @Test
    public  void givenContact_WhenAddedToAddressBook_ShouldReturnTrue()
    {
      AddressBookMain addressBookMain = new AddressBookMain();
      AddressBookDetails addressBookDetails = new AddressBookDetails("Prajakta", "Bramhe", "Ashtyavinayak colony", "Nagpur", "MH", "440034", "8149240833", "Prajkat@gmail.com");
      boolean isAdded = addressBookMain.addContact(addressBookDetails);
      Assertions.assertTrue(isAdded);
    }
}
