package com.bridgelabz.codeinclub.utils;

import com.bridgelabz.codeinclub.models.Person;
import com.bridgelabz.codeinclub.utils.CSVWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/** Class to displaying Input data. */
public class IO{
	
    final private static ArrayList<Person> AddressBook = new ArrayList<Person>();
    final private static Scanner scan = new Scanner(System.in);

	
	// Method to Read Inputs
    public static void readInput() throws IOException{
        String name;
		
        System.out.println("Enter your Name: \n");
        name = scan.nextLine();
        
        Person contact = new Person(name);

        System.out.println("Enter City: \n");
        contact.setCity(scan.nextLine());
		
        System.out.println("Enter State: \n");
        contact.setState(scan.nextLine());
		
        System.out.println("Enter Phone number: \n");
        contact.setPhoneNumber(scan.nextLine());
		
        System.out.println("Enter Zip code: \n");
        contact.setZip(scan.nextLine());
		
        AddressBook.add(contact);
        

        IO.writeOut();
    }

    public static void showContacts(){
        for(Person p : AddressBook){
			
            System.out.println("Name: " + p.getName());
            System.out.println("City: " + p.getCity());
            System.out.println("Phone: " + p.getPhoneNumber());
        }
    }
    
    public static void writeOut() throws IOException{
        CSVWriter.write(AddressBook);
    }
    
    public static void updateContact() {
    	CSVWriter.delete(AddressBook);
    }
    

    public static void deleteContact() {
    	CSVWriter.delete(AddressBook);
    }
    
}