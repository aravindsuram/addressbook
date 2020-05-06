package com.bridgelabz.codeinclub.services;

import com.bridgelabz.codeinclub.utils.AddressBook;
import com.bridgelabz.codeinclub.utils.AddressBookUtil;

import java.io.FileNotFoundException;


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
      public void editPerson(String openFilepath) throws IOException {
		 Person person = getFirstName();
        if(person!= null ){
        System.out.print("Edit person's Address: ");
        final String address = AddressBookUtil.getUserString();
        person.setAddress(address);
        System.out.print("Edit person's City: ");
        final String city =  AddressBookUtil.getUserString();
        person.setCity(city);
		System.out.print("Edit person's State: ");
        final String state = AddressBookUtil.getUserString();
        person.setState(state);
		System.out.print("Edit person's pincode: ");
        final String pinCode = AddressBookUtil.getUserString();
        person.setPinCode(pinCode);
        System.out.print("Edit person's Phone number: ");
        final String phone = AddressBookUtil.getUserString();
        person.setPhone(phone);
        }
    }

    }

    @Override
    public void deletePerson() {
         Person obj = getName();
        if(obj != null ){
            addressBook.remove(obj);
            System.out.println("Contact deleted");
            save();
        }else{
            System.out.println("Contact not found.");
        }
    }


    @Override
    public void display(){
         for(Person obj : addressBook){
            System.out.println("------------------");
            System.out.println("Name: "+obj.getName());
            System.out.println("Address: "+obj.getAddress());
            System.out.println("Phone: "+obj.getPhone());
        }
    }
    
    @Override
    public void save(){
         CSVWriter.writeAll(addressBook);
    }
}
 // To Sort All ZipCode
	private ArrayList<Integer> sortAllZip(List<Person> personsList) {
		ArrayList<Integer> sort = new ArrayList<>();
		for (Person p : personsList) {
			sort.add(p.getZip());
		}
		Collections.sort(sort);
		return sort;
	}
// Search in Address book with First name input
    private Person serach(String firstName){
        Person returnObj = null;
        for(Person obj : addressBook){
            if(firstName.equalsIgnoreCase(obj.getFirstName())){
                returnObj = obj;
                break;
            }
        }
        return returnObj;
    }
}