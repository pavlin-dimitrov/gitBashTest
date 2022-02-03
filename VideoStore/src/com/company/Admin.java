package com.company;

public class Admin {
    private final String email = "admin@admin.com";
    private final String password = "adminPass99";
    private final String name = "Pepo Videoto";
    private boolean login = false;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isLogin() {
        return login;
    }
}
