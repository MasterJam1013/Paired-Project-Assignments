package com.techelevator.crm;

import com.techelevator.crm.Billable;
import com.techelevator.crm.Person;

import java.util.ArrayList;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private ArrayList<String> pets = new ArrayList<String>();

    public Customer(String firstName, String lastName,String phoneNumber){
        super(firstName,lastName);
        this.phoneNumber = phoneNumber;
    }
    public Customer(String firstName, String lastName){
    super(firstName, lastName);
    this.phoneNumber = "";
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<String> getPets(){
        return pets;
    }

    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double total = 0.0;
        for(Map.Entry<String,Double> entry: servicesRendered.entrySet()){
            total += entry.getValue();
        }
        return total;
    }
}
