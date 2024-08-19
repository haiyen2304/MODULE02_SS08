package EX02;

public class RUN {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        System.out.println("Point1: " + point1);

        // Tạo đối tượng Point3D với tham số cụ thể
        Point3D point2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point2: " + point2);

        // Thay đổi giá trị của x, y và z cho point2
        point2.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point2: " + point2);

        // Lấy và in ra mảng {x, y, z} của point2
        float[] coordinates = point2.getXYZ();
        System.out.println("Point2 coordinates: x = " + coordinates[0] + ", y = " + coordinates[1] + ", z = " + coordinates[2]);
    }
}
