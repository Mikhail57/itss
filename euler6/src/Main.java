public class Main {

    public static void main(String[] args) {

        long sumOfSquare = 0, squaredSum = 0;

        for (int i=1; i<=100; i++){
            sumOfSquare += Math.pow(i, 2);
            squaredSum += i;
        }

        squaredSum = (long)Math.pow(squaredSum, 2);

        System.out.print(squaredSum-sumOfSquare);

    }

}
