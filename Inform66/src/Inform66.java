import java.util.Scanner;


public class Inform66 {
	static public void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for (int i=0; i<num; i++){
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		for (int i=1; i<num; i++){
			if (arr[i]>arr[i-1]){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
