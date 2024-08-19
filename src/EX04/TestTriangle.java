package EX04;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài ba cạnh của tam giác
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        // Nhập màu sắc của tam giác
        System.out.print("Enter color: ");
        String color = scanner.next();

        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        // In thông tin tam giác
        System.out.println("Triangle Info: " + triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        scanner.close();
    }
}

