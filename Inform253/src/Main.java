import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if ((year%4==0)&&((year%100!=0)||(year%400==0))){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
}
