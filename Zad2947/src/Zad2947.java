import java.util.Scanner;

public class Zad2947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int minUs, hor, min;
		
		minUs = scan.nextInt();
		
		hor = ((minUs / 60) % 24);
		min = minUs % 60;
		
		System.out.println(hor+" "+min);
		
	}
	
	

}
