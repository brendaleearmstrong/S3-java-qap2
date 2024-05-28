package Exercise2;
import Exercise1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Constructs a rectangle with the given top-left and bottom-right points.
     * 
     * @param topLeft     the top-left point of the rectangle
     * @param bottomRight the bottom-right point of the rectangle
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Constructs a rectangle with the given coordinates.
     * 
     * @param x1 the x-coordinate of the top-left point
     * @param y1 the y-coordinate of the top-left point
     * @param x2 the x-coordinate of the bottom-right point
     * @param y2 the y-coordinate of the bottom-right point
     */
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    /**
     * Returns the top-left point of the rectangle.
     * 
     * @return the top-left point
     */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /**
     * Sets the top-left point of the rectangle.
     * 
     * @param topLeft the new top-left point
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Returns the bottom-right point of the rectangle.
     * 
     * @return the bottom-right point
     */
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /**
     * Sets the bottom-right point of the rectangle.
     * 
     * @param bottomRight the new bottom-right point
     */
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     * 
     * @return the perimeter
     */
    public double getPerimeter() {
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return 2 * (width + height);
    }

    /**
     * Calculates and returns the area of the rectangle.
     * 
     * @return the area
     */
    public double getArea() {
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }

    /**
     * Returns a string representation of the rectangle.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
