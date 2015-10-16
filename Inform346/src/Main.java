import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(), temp;
        int pos=0, zer=0, neg=0;

        for (int i=0; i<num; i++){
            temp = scan.nextInt();
            if (temp>0){
                pos++;
            }else if (temp<0){
                neg++;
            }else{
                zer++;
            }
        }

        System.out.println(zer+" "+pos+" "+neg);
    }
}
