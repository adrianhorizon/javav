package com.prueba.examples.loginBean;

import java.io.Serializable;

public class loginBean implements Serializable {

    private String name;
    private String password;

    public loginBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autenticacion() {
        return (password.equals("12345") && name.equals("user"))?true:false;
    }
}
