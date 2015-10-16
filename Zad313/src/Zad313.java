import java.util.Scanner;

public class Zad313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n, k;
		n = scan.nextInt();
		k = scan.nextInt();
		
		System.out.println(binom(n, k));
		
	}
	
	static int binom(int n, int k){
		if (k==0||n==k){
			return 1;
		}
		return (binom(n-1, k-1) + binom(n-1, k));
	}

}
