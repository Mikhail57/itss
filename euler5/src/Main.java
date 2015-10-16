public class Main {

    public static void main(String[] args) {

        long number = 2520;

        while (!evenlyDivisible(number)){
            number++;
        }

        System.out.print(number);

    }

    static boolean evenlyDivisible(long num){
        for (int i=1; i<=20; i++){
            if ((num%i)!=0){
                return false;
            }
        }
        return true;
    }
}
