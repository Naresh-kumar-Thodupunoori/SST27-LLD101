public class SquareAsRectangle implements Shape {
    private Square square;

    public SquareAsRectangle(int side) {
        this.square = new Square(side);
    }

    public void setWidth(int width) {
        square.setSide(width);
    }

    public void setHeight(int height) {
        square.setSide(height);
    }

    @Override
    public int getArea() {
        return square.getArea();
    }
}
