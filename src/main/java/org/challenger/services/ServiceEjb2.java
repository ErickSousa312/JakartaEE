package org.challenger.services;

import jakarta.ejb.Stateless;

@Stateless
public class ServiceEjb2 {
    public String greet (String name) {
        return "hello " + name;
    }
}
