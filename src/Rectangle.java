public class Rectangle {

    protected double width;
    protected double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * length;
    }

    public void name() {
        System.out.println("Rectangle");
    }
}
