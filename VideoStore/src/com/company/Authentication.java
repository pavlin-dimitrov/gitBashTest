package com.company;

public class Authentication extends VideoStore {
    private String accountType;

    public String checkAccountType(VideoStore myVideoStore, String uEmail, String uPass) {
        for (int i = 0; i < myVideoStore.getNumberOfUsers(); i++) {
            if (uEmail.equals(myVideoStore.getUserEmail(i)) && uPass.equals(myVideoStore.getUserPassword(i))) {
                accountType = "user";
            }
        }
        if (uEmail.equals(getAdminEmail()) && uPass.equals(getAdminPass())) {
             accountType = "admin";
        }
        return accountType;
    }
}