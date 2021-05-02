package com.bridgelabz.addressbook;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain
{
    public  static  List<AddressBookDetails> addressBookDetailsList;
     public static void main(String[] args)
     {
         System.out.println("Welcome to Address Book Program");
     }
     public List<AddressBookDetails> addContact(AddressBookDetails addressBookDetails)
     {
         System.out.println(addressBookDetails);
         addressBookDetailsList = new ArrayList<>();
         try
         {
             addressBookDetailsList.add(addressBookDetails);
             return addressBookDetailsList;
         } catch (Exception e)
         {
             e.printStackTrace();
         }
         return  addressBookDetailsList;
     }

    public AddressBookDetails updateContact(List<AddressBookDetails> addressBookDetailsList, String name, String fieldName, String update) {
        try
        {
            for(AddressBookDetails contact : addressBookDetailsList)
            {
                if(contact.firstName.equals(name))
                {
                    switch (fieldName)
                    {
                        case "firstName":
                            contact.firstName = update;
                            System.out.println(contact);
                            break;
                        case "lastName":
                            contact.lastName = update;
                            System.out.println(contact);
                            break;
                        case "address":
                            contact.address = update;
                            System.out.println(contact);
                            break;
                        case "city":
                            contact.city = update;
                            System.out.println(contact);
                            break;
                        case "state":
                            contact.state = update;
                            System.out.println(contact);
                            break;
                        case "zip":
                            contact.zip = update;
                            System.out.println(contact);
                            break;
                        case "phone":
                            contact.phoneNo = update;
                            System.out.println(contact);
                            break;
                        case "email":
                            contact.email = update;
                            System.out.println(contact);
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public List<AddressBookDetails> deleteContact(List<AddressBookDetails> addressBookDetailsList, String name)
    {
        try
        {
            for (AddressBookDetails contact : addressBookDetailsList)
            {
                if (contact.firstName.equals(name))
                {
                    addressBookDetailsList.remove(addressBookDetailsList.indexOf(contact));
                    System.out.println("Contact deleted with name : " +name);
                    break;
                }

            }
            return addressBookDetailsList;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return addressBookDetailsList;
    }
    public List<AddressBookDetails> addContactList(List<AddressBookDetails> addressBookDetailsList)
    {
        try {
            for (AddressBookDetails contact : addressBookDetailsList)
            {
                addContact(contact);
            }
            return addressBookDetailsList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressBookDetailsList;
    }
}
