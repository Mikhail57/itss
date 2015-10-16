public class Main {

    public static void main(String[] args) {

        int a=0, b=0, c=0;

        int sqrt = (int)Math.sqrt(1000);
        for (int n = 1; n <= sqrt; n++) {
            for (int m = n+1; m <= sqrt; m++) {
                a = m*m - n*n;
                b = 2*m*n;
                c = m*m + n*n;
                if ( a + b + c == 1000 ) {
                    System.out.print(a * b * c);
                }
            }
        }

    }

}
