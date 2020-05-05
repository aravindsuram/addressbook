package com.bridgelabz.codeinclub.services;

import com.bridgelabz.codeinclub.utils.AddressBook;
import com.bridgelabz.codeinclub.utils.AddressBookUtil;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bridgelabz.codeinclub.modles.Person;



public class AddressBookInterface implements AddressBookService {
    final AddressBook book;

    public AddressBookServiceImpl(final AddressBook book){
        this.book = book;
    }

    @Override
    public void addPerson() {

        System.out.println("Enter contact's First name: ");
        final String firstName = AddressBookUtil.getUserString();

        System.out.println("Enter contact's Last name: ");
        final String lastName = AddressBookUtil.getUserString();

        System.out.println("Enter contact's Address: ");
        final String address = AddressBookUtil.getUserString();

        System.out.println("Enter contact's City: ");
        final String city =  AddressBookUtil.getUserString();

        System.out.println("Enter contact's State: ");
        final String state = AddressBookUtil.getUserString();

        System.out.println("Enter contact's Phone number: ");
        final String phone = AddressBookUtil.getUserString();

        System.out.println("Enter contact's Zip code: ");
        final String zip = AddressBookUtil.getUserString();

        final Person person = new Person(firstName,lastName, address, city, state, phone, zip);
        book.addToAddressBook(person);
    }

    @Override
    public void editPerson() {

    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void display(){
        book.displayContacts();
        System.out.println("lmpl");
    }

    @Override
    public void save(){
        book.save();
    }
}