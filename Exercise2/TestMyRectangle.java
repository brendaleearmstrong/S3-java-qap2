package Exercise2;
import Exercise1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(new MyPoint(1, 4), new MyPoint(5, 1));

        // Test toString
        System.out.println(rectangle);

        // Test getters and setters
        rectangle.setTopLeft(new MyPoint(2, 5));
        rectangle.setBottomRight(new MyPoint(6, 2));
        System.out.println("TopLeft: " + rectangle.getTopLeft());
        System.out.println("BottomRight: " + rectangle.getBottomRight());

        // Test getPerimeter and getArea
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}