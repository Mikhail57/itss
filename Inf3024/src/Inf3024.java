import java.util.Scanner;

public class Inf3024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x1,x2,x3,
			y1,y2,y3;
		
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		x3 = scan.nextInt();
		y3 = scan.nextInt();
		
		double per;
		per = Perimetr(x1,y1,x2,y2,x3,y3);
		
		per = per * 10000000;
		per = Math.floor(per);
		per = per / 10000000;
		
		System.out.println(per);
	}
	
	static double Perimetr(int x1, int y1, int x2, int y2, int x3, int y3){
		double AB, BC, CA;
		AB = Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
		BC = Math.sqrt( Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2) );
		CA = Math.sqrt( Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2) );
		return AB+BC+CA;
	}

}
