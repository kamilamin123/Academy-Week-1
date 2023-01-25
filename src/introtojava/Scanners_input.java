package introtojava;
import java.util.Scanner;
public class Scanners_input {
	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); 
			int num1, num2;
			System.out.print("Enter first number: ");
			num1 = scanner.nextInt();
			System.out.print("Enter second number: ");
			num2 = scanner.nextInt();
			int sum = num1 + num2;
			System.out.print("Sum of the two numbers entered: ");
			System.out.println(sum);
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				System.out.println(num + " is even.");
			}else {
				System.out.println(num + " is odd.");

}
	
		    }
		
	
}
