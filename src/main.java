public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        rectangle.resize(25);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(10);
        System.out.println(square);
        square.resize(20);
        System.out.println(square);
    }
}
