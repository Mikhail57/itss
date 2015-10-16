import java.util.Scanner;

public class Inform69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for (int i=0; i<num; i++){
			arr[i] = scan.nextInt();
		}
		
		for (int i=0; i<(num/2); i++){
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[num-i-1];
			arr[num-i-1] = temp;
		}
		
		for (int i=0; i<num; i++){
			if (i!=num-1){
				System.out.print(arr[i]+" ");
			}else{
				System.out.print(arr[i]);
			}
		}
		
	}
	

}
