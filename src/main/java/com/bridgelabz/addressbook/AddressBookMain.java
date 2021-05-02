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
        try {
            for(AddressBookDetails contact : addressBookDetailsList){
                if(contact.firstName.equals(name)) {
                    switch (fieldName) {
                        case "firstName":
                            contact.firstName = update;
                            break;
                        case "lastName":
                            contact.lastName = update;
                            break;
                        case "address":
                            contact.address = update;
                            System.out.println(contact);
                            break;
                        case "city":
                            contact.city = update;
                            break;
                        case "state":
                            contact.state = update;
                            break;
                        case "zip":
                            contact.zip = update;
                            break;
                        case "phone":
                            contact.phoneNo = update;
                            break;
                        case "email":
                            contact.email = update;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
