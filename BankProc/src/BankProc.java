import java.util.Scanner;

public class BankProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int percent = scan.nextInt();
		int max = scan.nextInt();
		int temp;
		
		double now = start;
		int i=0;
		
		while (max>now){
			now += now*percent/100;
			now = Math.floor(now*100);
			now = now / 100;
			i++;
		}
		
		System.out.println(i);
	}

}
