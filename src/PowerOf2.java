import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		int base = 0;
	       int Power = 0;
		   int result = 1;
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter base value: ");
		    base = sc.nextInt();
		    
		    
		    System.out.println("Enter power value: ");
		    Power = sc.nextInt();
		    
		  for(int i = 1; i <= Power; i++) {
			  result = result * base;
		  }
		  
		  System.out.println( "Value is: " + result );
	}
}
		  
				

	


