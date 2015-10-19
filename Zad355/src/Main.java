import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int array[][] = new int[num][num];

        /*
        * Read matrix from keyboard to array
        * */
        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                array[i][j] = scan.nextInt();
            }
        }


        boolean isSymmetry = true;

        for (int i=0; i<num; i++){
            for (int j=0; j<i; j++){
                if (array[i][j]!=array[j][i]){
                    isSymmetry = false;
                }
            }
        }

        System.out.print(((isSymmetry)?"yes":"no"));

    }
}
