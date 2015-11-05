/**
 * Created by student on 05.11.2015.
 */
public class Square extends Figure {
    int width;

    Square(int x, int y, int width) {
        super(x,y);
        this.width = width;
    }

    @Override
    public double area() {
        return (width*width);
    }

    @Override
    public double perimeter() {
        return (4*width);
    }

    public String toString() {
        return "x=" + x + "; y=" + y + "; width=" + width + ";";
    }

}
