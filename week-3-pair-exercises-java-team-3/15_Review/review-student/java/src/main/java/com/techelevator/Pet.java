package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private ArrayList<String> vaccinations = new ArrayList<String>();

    public Pet(String name , String species){
        this.name = name;
        this.species = species;
    }
    public void vaccineList(){
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");
    }

    public String listVaccinations(){
        StringBuilder builder = new StringBuilder();
        for (String vaccination : vaccinations) {
            builder.append(vaccination).append(", ");
        }

        String output = builder.substring(0,builder.length()-2);

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}
