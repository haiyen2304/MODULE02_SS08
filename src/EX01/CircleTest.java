package EX01;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle"+c1);
        Circle c2 = new Circle(2.5);
        System.out.println("Circle"+c2);
        Circle c3 = new Circle(3.0,"blue");
        System.out.println("Circle"+c3);

        c3.setRadius(4.0);
        c3.setColor("red");
        System.out.println("Circle 3 (updated): " + c3);
        System.out.println("C3 area: " + c3.getArea());

        // Tạo đối tượng Cylinder với constructor không tham số
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1: " + cylinder1);

        // Tạo đối tượng Cylinder với bán kính cụ thể
        Cylinder cylinder2 = new Cylinder(2.5);
        System.out.println("Cylinder 2: " + cylinder2);

        // Tạo đối tượng Cylinder với bán kính và chiều cao cụ thể
        Cylinder cylinder3 = new Cylinder(3.0, 5.0);
        System.out.println("Cylinder 3: " + cylinder3);

        // Tạo đối tượng Cylinder với bán kính, chiều cao, và màu sắc cụ thể
        Cylinder cylinder4 = new Cylinder(3.0, 5.0, "yellow");
        System.out.println("Cylinder 4: " + cylinder4);

        // Thay đổi chiều cao của Cylinder 4
        cylinder4.setHeight(7.0);
        System.out.println("Cylinder 4 (updated): " + cylinder4);

        // Kiểm tra thể tích của Cylinder 4
        System.out.println("Cylinder 4 Volume: " + cylinder4.getVolume());
    }
}
