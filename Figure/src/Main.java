public class Main {

    public static void main(String[] args) {
        Figure[] f = new Figure[3];
        f[0] = new Rectangle(0,0, 10, 20);
        f[1] = new Circle(1, 2, 5);
        f[2] = new Square(5,6, 2);

        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
    }
}
