package org.challenger.fetchExample;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class checkBoxClass {

    private List<String> selectedOptions;
    private List<String> options;


    public checkBoxClass() {
        options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");

        selectedOptions = new ArrayList<>();
    }

    public List<String> getSelectedOptions() {
        System.out.println("chamou select options");
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        System.out.println("chamou set select options");
        this.selectedOptions = selectedOptions;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        System.out.println("chamou set options");
        this.options = options;
    }

    public String submit() {
        // Handle form submission, e.g., save selected options to database
        return null; // Stay on the same page
    }

}
