package com.bridgelabz.codeinclub.utils;

import com.bridgelabz.codeinclub.modles.Person;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;

/* CSVWriter: This class writes address book data into file in csv format. */
public class CSV {

    public static void writeAll(ArrayList<Person> persons){
    	System.out.println("writeAll");
        try{
            PrintWriter printwriter = new PrintWriter("com/bridgelabz/codeinclub/utils/data/AddressBook.csv");
                for(Person person : persons){
                    String csv = person.getFirstName()+","+person.getLastName()+","+person.getAddress()+","+person.getAddress()+","+person.getCity()+","+person.getState()+","+person.getZip()+","+person.getPhone()+";";
                    printwriter.println(csv);
                }
                printwriter.close();
            }catch(IOException e){
                System.out.println("Error: File not found to read from.");
            }
        System.out.println("Written into file");
    }


}