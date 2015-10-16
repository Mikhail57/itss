import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numRows, numCols;
        numRows = scan.nextInt();
        numCols = scan.nextInt();

        int numMine = scan.nextInt();

        int pole[][] = new int[numRows+2][numCols+2];

        for (int i=0; i<numRows+2; i++){
            for (int j=0; j<numCols; j++){
                pole[i][j] = 0;
            }
        }

        for (int i=0; i<numMine; i++){
            int tempCol, tempRow;
            tempRow = scan.nextInt();
            tempCol = scan.nextInt();

            pole[tempRow][tempCol] = 100;

            pole[tempRow-1][tempCol-1]++;
            pole[tempRow-1][tempCol]++;
            pole[tempRow-1][tempCol+1]++;

            pole[tempRow][tempCol-1]++;
            pole[tempRow][tempCol]++;
            pole[tempRow][tempCol+1]++;

            pole[tempRow+1][tempCol-1]++;
            pole[tempRow+1][tempCol]++;
            pole[tempRow+1][tempCol+1]++;
        }


        for (int i=1; i<=numRows; i++){
            for (int j=1; j<numCols+1; j++){
                if (pole[i][j]>=100){
                    System.out.print("* ");
                }else{
                    System.out.print(pole[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
