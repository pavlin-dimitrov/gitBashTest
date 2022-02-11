package auth;

public class UserDatabase {
    private Client[] allClients;
    private Admin admin;
    private int numberOfClients;

    public UserDatabase() {
        this.allClients = new Client[10];
        this.numberOfClients = 0;
        this.admin = new Admin("admin@abv.bg", "Joro Lentata", "admin");
    }

    public void addUser(Client user) {
        allClients[numberOfClients] = user;
        numberOfClients++;
    }

    public boolean userExists(String userEmail) {
        return userExistsAsClient(userEmail) || userExistsAsAdmin(userEmail);
    }

    private boolean userExistsAsAdmin(String userEmail) {
        return getAdmin(userEmail) != null;
    }

    private boolean userExistsAsClient(String userEmail) {
        return getClient(userEmail) != null;
    }

    public User getUser(String userEmail){
        User user = getClient(userEmail);
        if (user == null){
            user = getAdmin(userEmail);
        }
        return user;
    }

    private User getAdmin(String userEmail) {
        if (admin.getUserEmail().equals(userEmail)){
            return admin;
        }
        return null;
    }

    private User getClient(String userEmail) {
        for (int i = 0; i < numberOfClients; i++) {
            if (allClients[i].getUserEmail().equals(userEmail)) {
                return allClients[i];
            }
        }
        return null;
    }
}
