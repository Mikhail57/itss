import java.util.Scanner;

public class Rabbits {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long count, plusnum, res;

        count = scan.nextInt();
        plusnum = scan.nextInt();

        res = rabbits(count, plusnum);

        System.out.println(res);

    }

    static long rabbits(long count, long plus){
        long little=1, big=0, temp=0;
        for (long i=1; i<count; i++){
            temp = big * plus;
            big += little;
            little = temp;
        }
        return (little+big);
    }

}