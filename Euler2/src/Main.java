import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        long current = 2, prev = 1;
        BigInteger sum = new BigInteger("0");
        long res = 0;
        while (current<=4000000){
            if ((current % 2) == 0){
                sum = sum.add(new BigInteger(Long.toString(current)));
                res += current;
            }
            long temp = current;
            current+=prev;
            prev = temp;
        }
        System.out.print(sum+"   "+res);
    }
}
