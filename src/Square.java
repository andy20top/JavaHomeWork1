public class Square extends Rectangle {

    private Double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void name() {
        System.out.println("Square");
    }
}
