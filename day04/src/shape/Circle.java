package shape;

public class Circle extends Shape{
    private double redius;

    public Circle(int x, int y, double redius) {
        super(x, y);
        this.redius = redius;
    }

    @Override
    public double getArea() {
        return Math.pow(redius,2) + Math.PI;
    }

    @Override
    public double getCircume() {
        return 2*redius*Math.PI;
    }

    public double getRedius() {
        return redius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "redius=" + redius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
