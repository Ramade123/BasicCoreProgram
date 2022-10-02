import java.util.Scanner;


public class HarmonicNumer {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enterthe number: ");
		int a = r.nextInt();
		
		double result = 0.0;
		for (int i = 1; i <= a; i++) {
			result = result + (double) 1 / i;
		}
		System.out.println("Harmonic number of " + a + " is " + result);
		
	}
}
		

	


