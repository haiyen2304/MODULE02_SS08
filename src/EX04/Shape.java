package EX04;

public class Shape {
    private String color;

    // Constructor không có tham số
    public Shape() {
        this.color = "unknown";
    }

    // Constructor có tham số
    public Shape(String color) {
        this.color = color;
    }

    // Getter cho thuộc tính color
    public String getColor() {
        return color;
    }

    // Setter cho thuộc tính color
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString trả về thông tin màu sắc
    @Override
    public String toString() {
        return "Shape color: " + color;
    }

    // Main method để kiểm thử lớp Shape
    public static void main(String[] args) {
        // Kiểm thử constructor không tham số
        Shape shape1 = new Shape();
        System.out.println(shape1);  // Output: Shape color: unknown

        // Kiểm thử constructor có tham số
        Shape shape2 = new Shape("Red");
        System.out.println(shape2);  // Output: Shape color: Red

        // Kiểm thử setter
        shape2.setColor("Blue");
        System.out.println("Updated color: " + shape2.getColor());  // Output: Updated color: Blue
    }
}
