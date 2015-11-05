/**
 * Created by student on 05.11.2015.
 */
public class Rectangle extends Figure {

    int width, height;

    Rectangle(int x, int y, int width, int height) {
        super(x,y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (width*height);
    }

    @Override
    public double perimeter() {
        return (2*(width+height));
    }

    public String toString() {
        return "x=" + x + "; y=" + y + "; width=" + width + "; height=" + height;
    }
}
