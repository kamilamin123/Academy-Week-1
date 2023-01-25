package introtojava;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int fact;
			//System.out.println("enter the positive integer you want factorial for: ");
			fact = scan.nextInt();
			int n = 1;
			while (fact > 1 ) {
				n *= fact;
				fact--;	
				
			}
			System.out.println("factprial equal :"+ n);
		}
		
		// TODO Auto-generated method stub

	}

}
