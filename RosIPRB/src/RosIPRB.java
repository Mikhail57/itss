import java.util.Scanner;

public class RosIPRB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double k, m, n;
		k = scan.nextInt();
		m = scan.nextInt();
		n = scan.nextInt();
		
		double population = k + m + n;
		double pKK = (k/population) * ((k-1) / (population-1));
		
		double pMK = (m/population) * (k / (population-1));
		double pMM = (m/population) * ((m-1) / (population-1)) * 0.75;
		double pMN = (m/population) * (n / (population-1)) * 0.5;
		
		double pNK = (n/population) * ((n-1) / (population-1));
		double pNM = (n/population) * (m / (population-1)) * 0.5;
		
		
		
		double prob = pKK+pMK+pMM+pMN+pNK+pNM;
		System.out.printf("%.5f%n", prob);

	}

}
