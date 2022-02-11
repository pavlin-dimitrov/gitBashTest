import VideoStore.VideoStoreManager;
import auth.AuthenticationManager;
import communication.CommunicationManager;

public class Main {
    public static void main(String[] args) {
        new VideoStoreManager(
                new CommunicationManager(),
                new AuthenticationManager()
        ).initializeProgram();
    }
}
