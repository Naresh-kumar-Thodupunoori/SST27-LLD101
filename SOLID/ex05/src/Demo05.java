
public class Demo05 {
    // Method that works with any Shape
    static int getArea(Shape shape) {
        return shape.getArea();
    }
    public static void main(String[] args) {
        System.out.println(getArea(new Rectangle(5, 4))); // 20
        System.out.println(getArea(new Square(5)));    // 16 (!) violates expectation
    }
}
