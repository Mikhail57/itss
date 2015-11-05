/**
 * Created by student on 05.11.2015.
 */
public class Circle extends Figure {
    int radius;

    Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI*Math.pow(radius, 2));
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return "x=" + x + "; y=" + y + "; radius=" + radius + ";";
    }
}
