public class Rectangle {
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getRectanglePerimeter(){
        double rectanglePerimeter = (2 * sideA) + (2 * sideB);
        return (int) rectanglePerimeter;
    }
    public int getRectangleArea(){
        double rectangleArea = sideA * sideB;
        return (int) rectangleArea;
    }
}
