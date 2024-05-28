/*
 * MyPoint.java
 * Author: Brenda Armstrong, SD10
 * Description: This class models a point with x and y coordinates.
 */

package Exercise1;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(1, 2, 3, 4);

        // Test toString
        System.out.println(line);

        // Test getters and setters
        line.setBegin(new MyPoint(5, 6));
        line.setEnd(new MyPoint(7, 8));
        System.out.println("Begin: " + line.getBegin());
        System.out.println("End: " + line.getEnd());

        // Test getLength and getGradient
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}


