public class Circle {
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    public int getCirclePerimeter(){
        double pi = 3.14159265358979323846;
                double circlePerimeter = 2 * pi * radius;
                return (int) circlePerimeter;
    }

    public int getCircleArea(){
        double pi = 3.14159265358979323846;
        double circleArea = pi * radius * radius;
        return (int) circleArea;
    }
}
