import java.util.Scanner;

public class MaxOF3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1>=num2&&num1>=num3){
			System.out.println(num1);
		} 
		else{
			if(num2>=num1&&num2>=num3){
				System.out.println(num2);
			}else{
				if (num3>=num1&&num3>=num2){
					System.out.println(num3);
				}
			}
		}
	}

}
