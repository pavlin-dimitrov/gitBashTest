package com.company;

public class VideoStore {
    private Movie[] storeResource;
    private User[] users;
    private int numberOfUsers;
    private int numOfResource;

    public VideoStore(){
        this.users = new User[10];
        this.storeResource = new Movie[11];
        this.numberOfUsers = 0;
        this.numOfResource = 0;
    }

    public void setStoreResource(Movie resource) {
       storeResource[numOfResource] = resource;
       numOfResource++;
    }

    public String getAllResourcesDetails() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numOfResource; i++) {
            sb.append(storeResource[i].getDetails());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void setStoreUser(User resource) {
        users[numberOfUsers] = resource;
        numberOfUsers++;
    }

    public String getAllUsers() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numberOfUsers; i++) {
            sb.append(users[i].getUserDetails());
            sb.append("\n");
        }
        return sb.toString();
    }
}
