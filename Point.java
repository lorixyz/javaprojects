/**  @author lorixyz
 * Description: This class represents a point in a 2D space with x and y coordinates. 
 * It includes methods to calculate the distance between two points and to determine 
 * the quadrant of the point.
 * 
 * 1. Fields
 * 2. Constructor   
 * 3. Getters and Setters
 * 4. distance method
 * 5. getQuadrant method
 * */

public class Point {
    // 1. Fields
    private double x;
    private double y;

    // 2. Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 3. Getters and Setters 
    public double getX() {
        return x;  
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 4. distance method
    public double distance(Point other) {
        double distanceX = this.x - other.x;
        double distanceY = this.y - other.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    // 5. getQuadrant method
    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1; // First quadrant
        } else if (x < 0 && y > 0) {
            return 2; //Second quadrant
        } else if (x < 0 && y < 0) {
            return 3; // Third quadrant
        } else if (x > 0 && y < 0) {
            return 4; // Fourth quadrant 
        } else {
            return 0; //origin
        }
    }
        
}
