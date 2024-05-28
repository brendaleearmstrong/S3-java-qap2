/*
 * MyLine.java
 * Author: Brenda Armstrong, SD10
 * Description: This class models a line with a begin point and an end point.
 */

 package Exercise1;

 public class MyLine {
     private MyPoint begin;
     private MyPoint end;
 
     // Constructor to initialize line with coordinate points
     public MyLine(int x1, int y1, int x2, int y2) {
         this.begin = new MyPoint(x1, y1);
         this.end = new MyPoint(x2, y2);
     }
 
     // Constructor to initialize line with MyPoint instances
     public MyLine(MyPoint begin, MyPoint end) {
         this.begin = begin;
         this.end = end;
     }
 
     // Getter for begin point
     public MyPoint getBegin() {
         return begin;
     }
 
     // Setter for begin point
     public void setBegin(MyPoint begin) {
         this.begin = begin;
     }
 
     // Getter for end point
     public MyPoint getEnd() {
         return end;
     }
 
     // Setter for end point
     public void setEnd(MyPoint end) {
         this.end = end;
     }
 
     // Getter for begin x coordinate
     public int getBeginX() {
         return begin.getX();
     }
 
     // Setter for begin x coordinate
     public void setBeginX(int x) {
         begin.setX(x);
     }
 
     // Getter for begin y coordinate
     public int getBeginY() {
         return begin.getY();
     }
 
     // Setter for begin y coordinate
     public void setBeginY(int y) {
         begin.setY(y);
     }
 
     // Getter for end x coordinate
     public int getEndX() {
         return end.getX();
     }
 
     // Setter for end x coordinate
     public void setEndX(int x) {
         end.setX(x);
     }
 
     // Getter for end y coordinate
     public int getEndY() {
         return end.getY();
     }
 
     // Setter for end y coordinate
     public void setEndY(int y) {
         end.setY(y);
     }
 
     // Getter for begin coordinates as an array
     public int[] getBeginXY() {
         return new int[]{begin.getX(), begin.getY()};
     }
 
     // Setter for begin coordinates
     public void setBeginXY(int x, int y) {
         begin.setX(x);
         begin.setY(y);
     }
 
     // Getter for end coordinates as an array
     public int[] getEndXY() {
         return new int[]{end.getX(), end.getY()};
     }
 
     // Setter for end coordinates
     public void setEndXY(int x, int y) {
         end.setX(x);
         end.setY(y);
     }
 
     // Method to calculate the length of the line
     public double getLength() {
         return begin.distance(end);
     }
 
     // Method to calculate the gradient of the line
     public double getGradient() {
         int xDiff = end.getX() - begin.getX();
         int yDiff = end.getY() - begin.getY();
         return Math.atan2(yDiff, xDiff);
     }
 
     // Override toString method to display line information
     @Override
     public String toString() {
         return "MyLine[begin=" + begin + ",end=" + end + "]";
     }
 }
 