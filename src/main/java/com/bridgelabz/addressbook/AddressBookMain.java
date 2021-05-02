package com.bridgelabz.addressbook;


import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain
{
    public List<AddressBookDetails> addressBookDetailsList;
     public static void main(String[] args)
     {
         System.out.println("Welcome to Address Book Program");
     }
     public boolean addContact(AddressBookDetails addressBookDetails)
     {
         System.out.println(addressBookDetails);
         List<AddressBookDetails> addressBookDetailsList = new ArrayList<>();
         try
         {
             addressBookDetailsList.add(addressBookDetails);
             System.out.println(addressBookDetailsList);
             return true;
         } catch (Exception e)
         {
             e.printStackTrace();
         }
         return  false;
     }
}
