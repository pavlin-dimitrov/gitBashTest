package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore myVideoStore = new VideoStore();
        storeUsers(myVideoStore);
        storeResource(myVideoStore);

        System.out.println("Enter e-mail: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        boolean isUser = checkIfUserExist(myVideoStore, email, password);
        Admin admin = new Admin();

        if ((email.equals(admin.getEmail()) && (password.equals(admin.getPassword())))) {
            System.out.println("Welcome admin!");
            admin.setLogin(true);
            while (admin.isLogin()) {
                System.out.println("Create new User - press 1;\n Show all users - press 2; \n Show all VHS - press 3; \n All booked VHS and users - press 4; \n LogOut - press 5");
                int option = sc.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Create new User");
                    case 2 -> System.out.println(myVideoStore.getAllUsers());
                    case 3 -> storeResource(myVideoStore);
                    case 4 -> System.out.println("All booked VHS and users");
                    case 5 -> {
                        admin.setLogin(false);
                        System.out.println("You are logged out!");
                    }
                    default -> System.out.println("You are out of range, select 1 of 5 options");
                }
            }
        } else if(isUser == true){
            System.out.println("this is a user...");
        } else {
            System.out.println("Wrong email or password");
        }
    }

    private static boolean checkIfUserExist(VideoStore myVideoStore, String email, String password) {
        boolean isUser = false;
        for (int i = 0; i < myVideoStore.getNumberOfUsers(); i++) {
            if (email.equals(myVideoStore.getUserEmail(i)) && password.equals(myVideoStore.getUserPassword(i))){
                isUser = true;
            }
        }
        return isUser;
    }

    private static void storeResource(VideoStore myVideoStore) {
        myVideoStore.setStoreResource(new Movie("movie One"));
        myVideoStore.setStoreResource(new Movie("movie Two"));
        myVideoStore.setStoreResource(new Movie("movie Three"));
        myVideoStore.setStoreResource(new Movie("movie Four"));
        myVideoStore.setStoreResource(new Movie("movie Five"));
        myVideoStore.setStoreResource(new Movie("movie Six"));
        myVideoStore.setStoreResource(new Movie("movie Seven"));
        myVideoStore.setStoreResource(new Movie("movie Eight"));
        myVideoStore.setStoreResource(new Movie("movie Nine"));
        myVideoStore.setStoreResource(new Movie("movie Ten"));
        System.out.println(myVideoStore.getAllResourcesDetails());
    }

    private static void storeUsers(VideoStore myVideoStore){
        myVideoStore.setStoreUser(new User("d.dimov@abv.bg","12345", "Dimo Dimov", false));
        myVideoStore.setStoreUser(new User("c.conev@abv.bg","12345", "Conko Conev", false));
        myVideoStore.setStoreUser(new User("e.elenkov@abv.bg","12345", "Elenko Elenkov", false));
    }
}
