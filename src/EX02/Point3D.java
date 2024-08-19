package EX02;

public class Point3D extends Point2D {
    private float z;

    // Constructor không tham số
    public Point3D() {
        super(); // Gọi constructor không tham số của lớp cha
        this.z = 0.0f;
    }

    // Constructor với tham số x, y và z
    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi constructor của lớp cha với x và y
        this.z = z;
    }

    // Getter cho z
    public float getZ() {
        return z;
    }

    // Setter cho z
    public void setZ(float z) {
        this.z = z;
    }

    // Setter cho x, y và z cùng lúc
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y); // Gọi setter của lớp cha cho x và y
        this.z = z;
    }

    // Lấy mảng {x, y, z}
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    // Cài đè phương thức toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
