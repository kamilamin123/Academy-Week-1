package introtojava;
import java.util.Scanner;
public class Fibonacci_input {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("Enter a number");
			int n = scan.nextInt();
			// TODO Auto-generated method stub
			int a = 0;
			int b = 1;
			int c = 0;
		
			for (int i=2; i < n; i++) {
				c = a + b ;
				a = b;
				b = c;
				System.out.println(c); }
			
		}

	}
}