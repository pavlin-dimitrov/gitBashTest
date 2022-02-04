package com.company;

public class Account {
    private final String email;
    private final String password;
    private final String name;
    private boolean isSigned;

    public Account(String email, String password, String name, boolean isSigned){
        this.email = email;
        this.password = password;
        this.name = name;
        this.isSigned = false;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setLogin(boolean isSigned) {
        this.isSigned = isSigned;
    }

    public boolean isLogin() {
        return isSigned;
    }
}
