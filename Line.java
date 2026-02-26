/** @author lorixyz
 * Description: This class represents a line in a 2D space defined by two points. 
 * It includes a method to calculate the slope of the line. 
 * 
 * 1. Fields
 * 2. Constructor
 * 3. Getters and Setters
 * 4. slope method
 * */

public class Line {
   // 1. Fields
   private Point point1;
   private Point point2; 

   // 2. Constructor
   public Line(Point point1, Point point2) {
      this.point1 = point1;
      this.point2 = point2;
   }

   // 3. Getters and Setters
   public Point getPoint1() {
    return point1;
   }

   public Point getPoint2() {
    return point2;
   }

   public void setPoint1(Point point1) {
    this.point1 = point1;
   }

   public void setPoint2(Point point2) {
    this.point2 = point2;
   }

   // 4. slope method
   public double slope() {
    if (point1.getX() == point2.getX()) {
        return Double.POSITIVE_INFINITY; // vertical line
    }
    return (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
   }
}
