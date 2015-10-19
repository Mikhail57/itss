import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int array[][] = new int[num][num];

        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                if ((num-j-1)==(i)){
                    array[i][j] = 1;
                }
                if ((num-j-1)>(i)){
                    array[i][j] = 0;
                }
                if ((num-j-1)<(i)){
                    array[i][j] = 2;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
