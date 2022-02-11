package communication;

import java.util.Scanner;

public class CommunicationManager {

    private Scanner scanner;

    public CommunicationManager() {
        this.scanner = new Scanner(System.in);
    }

    public void show(String text){
        System.out.println(text);
    }

    public void show(String[] array){
        System.out.println(array);
    }

    public void show(String[][] matrix){
        System.out.println(matrix);
    }

    public String getTextInput(){
        return scanner.nextLine();
    }

    public int getIntInput(){
        String input = getTextInput();
        return Integer.parseInt(input);
    }
}
