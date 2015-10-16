public class Main {

    public static void main(String[] args) {

        long num = 2;

        for (int i=0; i<10001; i++){
            while(!isPrime(num)){
                num++;
            }
            num++;
        }

        System.out.print(num-1);

    }

    static boolean isPrime(long n) {
        if (n==2) return true;
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
