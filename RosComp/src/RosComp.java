import java.util.Scanner;

public class RosComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String DNA;
		DNA = scan.nextLine();
		int a=0, c=0, g=0, t=0;
		
		for (int i=0; i<DNA.length(); i++){
			switch(DNA.charAt(i)){
				case 'A':a++; break;
				case 'C':c++; break;
				case 'G':g++; break;
				case 'T':t++; break;
			}
		}
		
		System.out.println(a+" "+c+" "+g+" "+t);
		
		
	}

}
