package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter e-mail: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        Admin admin = new Admin();
        if ((email.equalsIgnoreCase(admin.getEmail()) && (password.equalsIgnoreCase(admin.getPassword())))){
            System.out.println("Welcome admin!");
            admin.setLogin(true);
            while (admin.isLogin()){
                System.out.println("Create new User - press 1;\n Show all users - press 2; \n Show all VHS - press 3; \n All booked VHS and users - press 4; \n LogOut - press 5");
                int option = sc.nextInt();
                switch (option) {
                    case 1 -> System.out.println("Create new User");
                    case 2 -> System.out.println("Show all users");
                    case 3 -> System.out.println("Show all VHS");
                    case 4 -> System.out.println("All booked VHS and users");
                    case 5 -> {
                        admin.setLogin(false);
                        System.out.println("You are logged out!");
                    }
                    default -> System.out.println("You are out of range, select 1 of 5 options");
                }
            }
        } else {
            System.out.println("Wrong email or password");
        }
    }
}