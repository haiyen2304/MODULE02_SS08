package EX05;

public class StaticMethod {
    // Thuộc tính static PI
    public static final double PI = 3.14;

    // Phương thức static tính diện tích hình tròn
    public static double calCircleArea(double R) {
        return PI * R * R;
    }

    // Phương thức static tính diện tích hình chữ nhật
    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    // Phương thức static tính diện tích tam giác sử dụng công thức Heron
    public static double calTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

