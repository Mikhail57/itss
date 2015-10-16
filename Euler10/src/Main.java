public class Main {

    public static void main(String[] args) {

        long sum = 0;

        int i = 2;

        while (i<2000000){
            if (isPrime(i)) sum+=i;
            i++;
        }

        System.out.print(sum);

    }

    static boolean isPrime(int n) {
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
