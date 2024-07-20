package org.challenger;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 * A request scoped bean for the h:outputText example.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
@Named
@RequestScoped
public class TextBean {

    /**
     * Stores the output text.
     */
    private String outputText = "'Hello World'";

    /**
     * Get the outputText.
     *
     * @return the outputText.
     */
    public String getOutputText() {
        return outputText;
    }

    /**
     * Set the outputText.
     *
     * @param outputText the outputText.
     */
    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
}
