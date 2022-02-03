public class Panetone {
    private static int count;
    private static int chocolate;
    private static int raisins;
    private String filling;

    public Panetone(String filling) {
        this.filling = filling;
        count++;
        if (filling.equalsIgnoreCase("chocolate")){
            chocolate++;
        } else if (filling.equalsIgnoreCase("raisins")){
            raisins++;
        }
    }

    public static int getCount() {
        return count;
    }

    public static int getChocolate() {
        return chocolate;
    }

    public static int getRaisins() {
        return raisins;
    }
}
