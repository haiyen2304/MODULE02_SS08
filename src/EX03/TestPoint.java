package EX03;

public class TestPoint {
    public static void main(String[] args) {
        // Test Point class
        Point p = new Point(1.5f, 2.5f);
        System.out.println("Point: " + p); // Output: (1.5,2.5)

        // Test MovablePoint class
        MovablePoint mp = new MovablePoint(1.5f, 2.5f, 0.5f, 0.5f);
        System.out.println("MovablePoint before move: " + mp); // Output: (1.5,2.5),speed=(0.5,0.5)

        mp.move();
        System.out.println("MovablePoint after move: " + mp); // Output: (2.0,3.0),speed=(0.5,0.5)
    }
}

