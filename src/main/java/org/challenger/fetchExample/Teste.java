package org.challenger.fetchExample;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.io.IOException;
import java.io.Serializable;

@Named
@SessionScoped
public class Teste implements Serializable {
    public String redirect(){
        return "products?faces-redirect=true";
    };

    public void getRedirect() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        String contextPath = context.getExternalContext().getRequestContextPath();

        FacesContext.getCurrentInstance().getExternalContext().redirect(contextPath + "/restrict.jsp");
    }

}
