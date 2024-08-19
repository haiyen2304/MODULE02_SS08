package EX05;

public class Main {
    public static void main(String[] args) {
        // Tính diện tích hình tròn
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6.0);

        // Tính diện tích hình tam giác
        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);

        // Tính diện tích hình chữ nhật
        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);

        // In kết quả
        System.out.println("Circle Area with radius 3.5: " + circleArea1);
        System.out.println("Circle Area with radius 6.0: " + circleArea2);

        System.out.println("Triangle Area with sides (3, 4, 5): " + triangleArea1);
        System.out.println("Triangle Area with sides (4.5, 7, 6): " + triangleArea2);

        System.out.println("Rectangle Area with width 2.5 and height 6: " + rectangleArea1);
        System.out.println("Rectangle Area with width 4 and height 7: " + rectangleArea2);
    }
}

