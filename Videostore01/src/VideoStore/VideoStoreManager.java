package VideoStore;

import Movies.MovieManager;
import auth.AuthenticationManager;
import auth.LoginStatus;
import communication.CommunicationManager;

public class VideoStoreManager {
    private CommunicationManager communicationManager;
    private AuthenticationManager authenticationManager;
    private MovieManager movieManager;

    public VideoStoreManager(CommunicationManager communicationManager, AuthenticationManager authenticationManager) {
        this.communicationManager = communicationManager;
        this.authenticationManager = authenticationManager;
    }

    public void initializeProgram(){
        while (true){
            if (authenticationManager.hasLoggedUser()){
                processLoggedUserOptions();
            } else {
                authenticateUser();
            }
        }
    }

    private void authenticateUser(){
        communicationManager.show(getNonRegisterUserOptions());
        int userChoice = communicationManager.getIntInput();
        switch (userChoice){
            case 1:initLoginProcess(); break;
            case 2:initCreateClientProcess(); break;
        }
    }

    private void processLoggedUserOptions(){
        if(authenticationManager.isLoggedUserAdmin()) {
            communicationManager.show(getAdminUserOptions());
            int userChoice = communicationManager.getIntInput();
            switch (userChoice) {
                case 1: authenticationManager.logout(); break;
                case 2:
                    System.out.println("Something...."); break;
            }
        } else {
            communicationManager.show(getClientUserOptions());
            int userChoice = communicationManager.getIntInput();
            switch (userChoice) {
                case 1: authenticationManager.logout(); break;
            }
        }
    }
    private void initCreateClientProcess() {
        communicationManager.show("Enter user email:");
        String email = communicationManager.getTextInput();
        communicationManager.show("Enter user email:");
        String username = communicationManager.getTextInput();
        communicationManager.show("Enter password:");
        String password = communicationManager.getTextInput();
        communicationManager.show("Enter password again:");
        String repeatPassword = communicationManager.getTextInput();

        if(password.equals(repeatPassword)) {
            boolean registerIsSuccessful = authenticationManager.registerClient(email, username, password);
            if(registerIsSuccessful) {
                communicationManager.show("Registration successful");
            } else {
                communicationManager.show("Such user exists.");
            }
        } else {
            communicationManager.show("Passwords should match");
        }
    }

    private void initLoginProcess() {
        communicationManager.show("Enter email:");
        String email = communicationManager.getTextInput();
        communicationManager.show("Enter password:");
        String password = communicationManager.getTextInput();
        LoginStatus loginStatus = authenticationManager.login(email, password);
        if(loginStatus == LoginStatus.LOGIN_FAILED) {
            communicationManager.show("Login failed");
        } else {
            communicationManager.show("Login successfull");
        }
    }
    private String getNonRegisterUserOptions() {
        return "1. Login\n" +
                "2. Create new Client account";
    }

    private String getClientUserOptions() {
        return "1. Logout\n" +
                "2. Book movie";
    }

    private String getAdminUserOptions() {
        return "1. Logout\n" +
                "2. Something";
    }
}
