/*
 * MyPoint.java
 * Author: Brenda Armstrong, SD10
 * Description: This class models a point with x and y coordinates.
 */

 package Exercise1;

 public class MyPoint {
     private int x;
     private int y;
 
     // Constructor to initialize point coordinates
     public MyPoint(int x, int y) {
         this.x = x;
         this.y = y;
     }
 
     // Getter for x coordinate
     public int getX() {
         return x;
     }
 
     // Setter for x coordinate
     public void setX(int x) {
         this.x = x;
     }
 
     // Getter for y coordinate
     public int getY() {
         return y;
     }
 
     // Setter for y coordinate
     public void setY(int y) {
         this.y = y;
     }
 
     // Method to calculate the distance to another point with coordinates (x, y)
     public double distance(int x, int y) {
         int xDiff = this.x - x;
         int yDiff = this.y - y;
         return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
     }
 
     // Method to calculate the distance to another MyPoint instance
     public double distance(MyPoint another) {
         return distance(another.getX(), another.getY());
     }
 
     // Override toString method to display point coordinates
     @Override
     public String toString() {
         return "(" + x + "," + y + ")";
     }
 }
 