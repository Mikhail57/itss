import java.util.Scanner;

public class Perimetr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		
		if ((num==1) || (num%4==0)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}

}
