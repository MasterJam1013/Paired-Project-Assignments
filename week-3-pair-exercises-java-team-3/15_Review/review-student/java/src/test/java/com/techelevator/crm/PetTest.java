package com.techelevator.crm;

import com.techelevator.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PetTest {
    @Test
    public void test_list_vaccinations_return_a_correct_string(){
        Pet sut = new Pet("spot", "dog");

        sut.vaccineList();

        Assert.assertEquals("Rabies, Distemper, Parvo",sut.listVaccinations());

    }
}
