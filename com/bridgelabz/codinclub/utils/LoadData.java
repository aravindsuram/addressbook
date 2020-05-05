package com.bridgelabz.codeinclub.utils;

import com.bridgelabz.codeinclub.modles.Person;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/* LoadData: This class helps in loading data from file to program. */

public class LoadData{
    final private static ArrayList<Person> persons = new ArrayList<Person>();

    private static void split(String data){

    }
    public static void load(){
        try{
            File data = new File("com/bridgelabz/codeinclub/utils/data/AddressBook.csv");
            Scanner fileReader = new Scanner(data);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: File not found to read data");
        }
    }
}