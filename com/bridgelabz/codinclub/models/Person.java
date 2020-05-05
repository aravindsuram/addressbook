package com.bridgelabz.codeinclub.modles;

/**
Person: Class holds data of a preson and methods to preform action on the data.
this is also used for address book
@author aravind
*/

public class Person{
    // data
    final private String firstName;
    final private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    // constructors
    public Person(final String firstName, final String lastName, final String address, final String city, final String state, final String zip, final String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }


    public Person(final String firstName, final String lastName){
        this(firstName, lastName, null, null, null, null, null);
    }

    // getters
    public String getName(){
        String name = firstName + " " + lastName;
        return name;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    public String getPhone(){
        return phone;
    }

    // setters
    public void setAddress(final String address){
        this.address = address;
    }
    public void setCity(final String city){
        this.city = city;
    }
    public void setState(final String state){
        this.state = state;
    }
    public void setZip(final String zip){
        this.zip = zip;
    }
    public void setPhone(final String phone){
        this.phone = phone;
    }
}
