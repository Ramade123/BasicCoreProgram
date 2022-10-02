import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println("Prime Factor of " + n + " are : ");
		
		int i =2;
		while (n > 1) {
			  if (n % i == 0) {
				  System.out.println(i + " ");
				  n = n / i;
			  } else
				  i++;
		}
		System.out.println(" ");
		sc.close();
	}
}
			  
		

	


