package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CustomerTest {
    @Test
    public void get_balance_due_return(){
        Customer sut = new Customer("Joe","Biden");

        Map<String,Double> balanceMap = Map.of("Walking", 20.0,
                "Grooming",15.0,
                "Sitting", 100.0);

        Assert.assertEquals(135.0 , sut.getBalanceDue(balanceMap), .1);
    }
}
