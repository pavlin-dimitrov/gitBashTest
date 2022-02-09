package com.company;

public class Authentication {

    public static boolean isValidAccount (VideoStore myVideoStore, String uEmail, String uPass) {
        for (int i = 0; i < myVideoStore.getNumberOfUsers(); i++) {
            if (uEmail.equals(myVideoStore.getUserEmail(i)) && uPass.equals(myVideoStore.getUserPassword(i))) {
                return true;
            }
        }
        if (uEmail.equals(myVideoStore.getAdminEmail()) && uPass.equals(myVideoStore.getAdminPass())) {
            return true;
        }
        System.out.println("Wrong email or password");
        return false;
    }

    public static Account checkAccountType(VideoStore myVideoStore, String uEmail, String uPass) {
        for (int i = 0; i < myVideoStore.getNumberOfUsers(); i++) {
            if (uEmail.equals(myVideoStore.getUserEmail(i)) && uPass.equals(myVideoStore.getUserPassword(i))) {
                printUserOptions(myVideoStore, uEmail, uPass);
                return myVideoStore.getUser(i);
            }
        }
        if (uEmail.equals(myVideoStore.getAdminEmail()) && uPass.equals(myVideoStore.getAdminPass())) {
            printAdminOptions(myVideoStore);
            return myVideoStore.getAdmin();
        }
        System.out.println("Wrong email or password");
        return null;
    }

    private static void printUserOptions(VideoStore myVideoStore, String uEmail, String uPass) {
        System.out.println("this is a user..." + getLodgedUserName(myVideoStore, uEmail, uPass));
        System.out.println("Rent a movie - press 1;\n Return a movie - press 2;\n Show all my rented movies - press 3;\n Show all available movies - press 4; \n LogOut - press 5;");
    }

    private static void printAdminOptions(VideoStore myVideoStore) {
        System.out.println("Welcome admin!"+ myVideoStore.getAdminName());
        System.out.println("Create new User - press 1;\n Show all users - press 2; \n Show all VHS - press 3; \n All booked VHS and users - press 4; \n LogOut - press 5");
    }

    public static String getLodgedUserName(VideoStore myVideoStore, String uEmail, String uPass) {
        String userName = null;
        for (int i = 0; i < myVideoStore.getNumberOfUsers(); i++) {
            if (uEmail.equals(myVideoStore.getUserEmail(i)) && uPass.equals(myVideoStore.getUserPassword(i))) {
                userName = myVideoStore.getUserName(i);
            }
        }
        return userName;
    }
}
