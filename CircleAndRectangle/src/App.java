public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        Circle c2 = new Circle(4);
        Circle[] circles = {c1, c2};
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle number: " + (i+1) + " Perimeter and Area:");
            System.out.println("Perimeter: " + c1.getCirclePerimeter() + " cm.");
            System.out.println("Area: " + c1.getCircleArea() + " cm.");
        }

        Rectangle r1 = new Rectangle(4, 8);
        Rectangle r2 = new Rectangle(8, 20);
        Rectangle[] rectangles = {r1, r2};
        for (int j = 0; j < rectangles.length; j++) {
            System.out.println("Rectangle number: " + (j+1) + " Perimeter and Area:");
            System.out.println("Perimeter: " + r1.getRectanglePerimeter() + " cm.");
            System.out.println("Area: " + r1.getRectangleArea() + " cm.");
        }
    }
}
