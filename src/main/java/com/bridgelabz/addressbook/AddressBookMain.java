package com.bridgelabz.addressbook;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookMain {
    public static HashMap<String, List<AddressBookDetails>> addressBookMap = new HashMap<>();

    public static List<AddressBookDetails> addressBookDetailsList;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public HashMap<String, List<AddressBookDetails>> addContact(String addressBookName, AddressBookDetails addressBookDetails)
    {
        try
        {
            if (!addressBookMap.containsKey(addressBookName))
            {
                createNewAddAddressBook(addressBookName);
            }
            addressBookMap.get(addressBookName).add(addressBookDetails);
            System.out.println("Contact Added Successfully.");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return addressBookMap;
    }

    public boolean updateContact(HashMap<String, List<AddressBookDetails>> addressBookList, String addressBookName, String name, String fieldName, String update) {
        try
        {
            if (addressBookList.containsKey(addressBookName))
            {
                List<AddressBookDetails> contactList = addressBookList.get(addressBookName);
                for (AddressBookDetails contact : contactList)
                {
                    if (contact.firstName.equals(name))
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
                        System.out.println("Contact updated with name : " + name);
                    }
                    return true;
                }
            }
        }
        catch(Exception e)
            {
                e.printStackTrace();
            }
            return false;
        }

        public boolean deleteContact(HashMap<String, List<AddressBookDetails>> addressBookList, String addressBookName, String name)
        {

            try
            {
                if (addressBookList.containsKey(addressBookName))
                {
                    List<AddressBookDetails> addressBookDetailsList = addressBookList.get(addressBookName);
                }
                for (AddressBookDetails contact : addressBookDetailsList)
                {
                    if (contact.firstName.equals(name))
                    {
                        addressBookDetailsList.remove(addressBookDetailsList.indexOf(contact));
                        System.out.println("Contact deleted with name : " + name);
                        break;
                    }

                }
                return true;
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            return false;
        }
        public HashMap<String, List<AddressBookDetails>> addContactList(String addressBookName, List<AddressBookDetails> addressBookDetailsList)
        {
            try
            {
                for (AddressBookDetails contact : addressBookDetailsList)
                {
                    addContact(addressBookName, contact);
                }
                return addressBookMap;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return addressBookMap;
        }

        public HashMap<String, List<AddressBookDetails>> createNewAddAddressBook (String addressBookName)
        {
            try
            {
                addressBookMap.put(addressBookName, new ArrayList<AddressBookDetails>());
                System.out.println("New Address Book Created with Name : " + addressBookName);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            return addressBookMap;
        }
    }
