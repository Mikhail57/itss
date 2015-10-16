import java.util.Scanner;

public class MortalRabbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numMonth, lifeCount;
		numMonth = scan.nextInt();
		lifeCount = scan.nextInt();
		long states[];
		
		states = new long[numMonth];
		states[0] = 1;
		for (int i=1; i<numMonth; i++){
			
			long child = 0;
			
			for (int j=1; j<lifeCount; j++){
				child += states[j];
			}
			
			for (int j=lifeCount-1; j>0; j--){
				states[j] = states[j-1];
			}
			states[0] = child;
			
		}
		
		long res = 0;		
		for (int j=0; j<lifeCount; j++){
			res += states[j];
		}
		System.out.println(res);
		
	}

}
