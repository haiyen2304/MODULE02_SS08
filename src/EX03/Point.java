package EX03;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0f, 0.0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

//    // Test the Point class
//    public static void main(String[] args) {
//        Point p1 = new Point(2.5f, 3.8f);
//        System.out.println(p1); // Output: (2.5,3.8)
//
//        p1.setX(5.2f);
//        p1.setY(4.4f);
//        System.out.println(p1); // Output: (5.2,4.4)
//
//        p1.setXY(7.5f, 1.2f);
//        System.out.println(p1); // Output: (7.5,1.2)
//
//        float[] coords = p1.getXY();
//        System.out.println("X: " + coords[0] + ", Y: " + coords[1]); // Output: X: 7.5, Y: 1.2
//    }
}

