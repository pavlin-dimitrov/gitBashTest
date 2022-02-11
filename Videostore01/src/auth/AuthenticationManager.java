package auth;

public class AuthenticationManager {
    private final UserDatabase database;
    private User loggedUser;

    public AuthenticationManager() {
        this.database = new UserDatabase();
        this.loggedUser = null;
    }

    public boolean registerClient(String clientEmail,String clientName, String clientPassword){
        if (database.userExists(clientEmail)){
            return false;
        }
        Client client = new Client(clientEmail, clientName, clientPassword);
        database.addUser(client);
        return true;
    }

    public LoginStatus login(String userEmail, String password){
        User user = database.getUser(userEmail);
        if (user != null && user.getPassword().equals(password)){
            loggedUser = user;
            return user instanceof Client ? LoginStatus.LOGGED_CLIENT : LoginStatus.LOGGED_ADMIN;
        }
        return LoginStatus.LOGIN_FAILED;
    }

    public void logout(){
        this.loggedUser = null;
    }

    public boolean hasLoggedUser(){
        return loggedUser != null;
    }

    public boolean isLoggedUserAdmin(){
        return hasLoggedUser() && loggedUser instanceof Admin;
    }
}
