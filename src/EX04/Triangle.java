package EX04;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Constructor không có tham số
    public Triangle() {
        super();
    }

    // Constructor có tham số cho ba cạnh của tam giác
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter và Setter cho các trường dữ liệu
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Phương thức getArea tính diện tích tam giác sử dụng công thức Heron
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Phương thức getPerimeter tính chu vi tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức toString trả về thông tin của tam giác
    @Override
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3 + " | " + super.toString();
    }

    // Main method để kiểm thử lớp Triangle
    public static void main(String[] args) {
        // Tạo đối tượng Triangle với tham số mặc định
        Triangle triangle1 = new Triangle();
        triangle1.setColor("Green");
        System.out.println(triangle1);  // Output: Triangle with sides: 1.0, 1.0, 1.0 | Shape color: Green
        System.out.println("Area: " + triangle1.getArea());  // Output: Area
        System.out.println("Perimeter: " + triangle1.getPerimeter());  // Output: Perimeter

        // Tạo đối tượng Triangle với tham số cụ thể
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        triangle2.setColor("Yellow");
        System.out.println(triangle2);  // Output: Triangle with sides: 3.0, 4.0, 5.0 | Shape color: Yellow
        System.out.println("Area: " + triangle2.getArea());  // Output: Area
        System.out.println("Perimeter: " + triangle2.getPerimeter());  // Output: Perimeter
    }
}

