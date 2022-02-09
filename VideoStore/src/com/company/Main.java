package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore myVideoStore = new VideoStore();
        storeUsers(myVideoStore);
        storeResource(myVideoStore);

        InputOutput.getCredentials(myVideoStore);
        Account lodgedAccount = (InputOutput.getAccountType(myVideoStore));
        boolean isSigned;

        if (lodgedAccount instanceof Admin) {
            isSigned = true;
            while (isSigned) {
                int option = sc.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Create new User");
                    case 2 -> System.out.println(myVideoStore.getAllUsers());
                    case 3 -> System.out.println(myVideoStore.getAllResourcesDetails());
                    case 4 -> System.out.println("All booked VHS and users");
                    case 5 -> {
                        isSigned = false;
                        System.out.println("You are logged out!");
                    }
                    default -> System.out.println("You are out of range, select 1 of 5 options");
                }
            }
        } else if(lodgedAccount instanceof User){
            // Rent a movie;
            // Return a movie;
            // Show all my rented movies;
            // Show all available movies;
        }
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
    }

    private static void storeUsers(VideoStore myVideoStore){
        myVideoStore.setStoreUser(new User("d.dimov@abv.bg","12345", "Dimo Dimov", false));
        myVideoStore.setStoreUser(new User("c.conev@abv.bg","12345", "Conko Conev", false));
        myVideoStore.setStoreUser(new User("e.elenkov@abv.bg","12345", "Elenko Elenkov", false));
    }
}
