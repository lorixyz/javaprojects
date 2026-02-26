/** @author Andrea N. Veloro
 *  Description: Main class to demonstrate the functionality of the Point class. 
 * 1. Create points in different quadrants and on axes
 * 2. Test getters and setters
 * 3. Testing different quadrants
 * 4. Testing distance method
 * */
 

public class PointDemo {
    public static void main(String[] args) {

        // 1. Creating points in different quadrants and on axes
        Point point1 = new Point(1, 2);      // Q1
        Point point2 = new Point(6, 8);      // Q1
        Point point3 = new Point(-2, 5);     // Q2
        Point point4 = new Point(-3, -4);    // Q3
        Point point5 = new Point(3, -4);     // Q4
        Point originPoint = new Point(0, 0);     // Origin 
        Point xAxisPoint = new Point(3, 0);     // On x-axis
        Point yAxisPoint = new Point(0, 5);     // On y-axis
        int quadrant = point1.getQuadrant();

        // 2.a Testing points before setters
        System.out.println("=== Testing before setters ===\n");
        System.out.println("point1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("point2: (" + point2.getX() + ", " + point2.getY() + ")");

        // 2.b Testing setters and getters
        System.out.println("\n=== Testing Setters/Getters ===\n");
        point1.setX(3);
        point1.setY(4);
        point2.setX(7);
        point2.setY(9);
        System.out.println("Updated point1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Updated point2: (" + point2.getX() + ", " + point2.getY() + ")");

        // 3. Testing different quadrants 
        System.out.println("\n=== Testing different quadrants ===\n");
        System.out.println("Point1 (1, 2) is in quadrant: " + quadrant); //using old point1
        System.out.println("Point2 (7, 9) is in quadrant: " + point2.getQuadrant()); //using updated point2
        System.out.println("Point3 (-2, 5) is in quadrant: " + point3.getQuadrant());
        System.out.println("Point4 (-3, -4) is in quadrant: " + point4.getQuadrant());
        System.out.println("Point5 (3, -4) is in quadrant: " + point5.getQuadrant());
        System.out.println("originPoint (0, 0) is in quadrant: " + originPoint.getQuadrant());
        System.out.println("xAxisPoint (3, 0) is in quadrant: " + xAxisPoint.getQuadrant());
        System.out.println("yAxisPoint (0, 5) is in quadrant: " + yAxisPoint.getQuadrant());

        // 4. Testing distance 
        System.out.println("\n=== Testing distance ===\n");
        System.out.printf("Distance between point1 (3,4) and point2 (7,9): %.2f%n", point1.distance(point2));
        System.out.printf("Distance between xAxisPoint(3,0) and originPoint(0,0): %.2f%n", xAxisPoint.distance(originPoint));

    }
}
