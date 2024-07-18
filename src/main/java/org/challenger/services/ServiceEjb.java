package org.challenger.services;

import jakarta.ejb.Stateless;

@Stateless
public class ServiceEjb {

    private int count;

    public String printName(String input) {
        System.out.println("test with instance state: " + this);
        count ++;
        System.out.println("value of count: " + count);

        return "Hello," + input + "!\n";
    }
}
