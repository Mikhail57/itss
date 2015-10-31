import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int first1 = scan.nextInt(),
            second1 = scan.nextInt(),
            first2 = scan.nextInt(),
            second2 = scan.nextInt();

        Fraction sample1 = new Fraction(first1, second1);
        Fraction sample2 = new Fraction(first2, second2);


        sample1 = sample1.Sub(sample2);

        System.out.println(sample1.toString());
    }
}