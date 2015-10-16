import java.util.Scanner;

public class FirstRealLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double radius;
		
		radius = scan.nextDouble();
		
		double res;
		res = Math.PI*Math.pow(radius, 2);
		
		System.out.println(res);
		
	}

}
