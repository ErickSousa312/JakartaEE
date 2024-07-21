package org.challenger.exampleWithJavaEE;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class TesteText {

    private String text="";

    public String returnText() {
        System.out.println("foi acessado");
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
