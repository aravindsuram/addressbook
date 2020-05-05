package com.bridgelabz.codeinclub.utils;
import com.bridgelabz.codeinclub.modles.Person;
import com.bridgelabz.codeinclub.utils.CSVWriter;
import com.bridgelabz.codeinclub.services.AddressBookServiceImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
InputOutput: This class helps in getting input data and displaying data.
@author aravind
*/
public class AddressBook{
	
	public Scanner sc;
    final private ArrayList<Person> addressBook = new ArrayList<>();
    
    final public String filepath = "com/bridgelabz/codeinclub/utils/data/AddressBook.csv";
    public void addToAddressBook(final Person person) throws IOException{
        addressBook.add(person);
        
        sc = new Scanner(new File(filepath));
    	sc.useDelimiter(",");
    	
    	while (sc.hasNext()) {  
    		String word = sc.next();  
    		
    		if (!(person.getName() == word)) {
    			FileWriter fw = new FileWriter(filepath,true);
    			BufferedWriter bw=new BufferedWriter(fw);
    			PrintWriter pw=new PrintWriter(bw);
    			pw.println(person.getName()+","+person.getAddress()+","+person.getCity()+","+person.getPhone()+","+person.getState()+","+person.getZip());
    			
    			//Close Files
    			pw.flush();
    			pw.close();
    			
    	        System.out.println(person.getName() + " Contact is Added");
    		}
    		else {
    			System.out.println("Contact is Already Exist");
    		}
    	}   
    }

    public void displayContacts() {
		try {
			sc = new Scanner(new File(filepath));

	    	sc.useDelimiter(","); 
	    	
	    	while (sc.hasNext()) {  
	    		System.out.print(sc.next() + " ");  
	    	}
	    	sc.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
    }

    public void save(){
        CSVWriter.writeAll(addressBook);
    }
}