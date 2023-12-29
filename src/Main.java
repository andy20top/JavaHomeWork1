public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        System.out.println("Площадь круга = " + circle1.calculateArea());
        System.out.println("Периметер круга = " + circle1.calculatePerimeter());
        System.out.println("______________________");

        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println("Площадь прямоугольника = " + rectangle1.calculateArea());
        System.out.println("Периметер прямоугольника = " + rectangle1.calculatePerimeter());
        rectangle1.name();
        System.out.println("______________________");

        Rectangle square1 = new Square(5);
        System.out.println("Площадь квадрата = " + square1.calculateArea());
        System.out.println("Периметер квадрата = " + square1.calculatePerimeter());
        square1.name();
        System.out.println("______________________");

        Square square2 = new Square(4);
        System.out.println("Площадь квадрата = " + square2.calculateArea());
        System.out.println("Периметер квадрата = " + square2.calculatePerimeter());

    }
}