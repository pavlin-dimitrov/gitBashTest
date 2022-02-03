
public class App {
    public static void main(String[] args) {

        Panetone p1 = new Panetone("chocolate");
        Panetone p2 = new Panetone("raisins");
        Panetone p3 = new Panetone("raisins");
        Panetone p4 = new Panetone("chocolate");
        Panetone p5 = new Panetone("raisins");
        Panetone p6 = new Panetone("raisins");
        Panetone p7 = new Panetone("chocolate");

        System.out.println("You've baked " + Panetone.getCount() + "panetone today!");
        System.out.println("With chocolate filling: " + Panetone.getChocolate());
        System.out.println("With raisins filling: " + Panetone.getRaisins());
        System.out.println("Character(unicode point)");
    }
}
