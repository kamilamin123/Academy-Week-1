package introtojava;
import java.util.Scanner;
public class negtive_positive {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int checkNegative;
			System.out.print("input integer number to check if it is positive or negative :");
			checkNegative = scan.nextInt();
			if (checkNegative > 0) {
				System.out.println("Positive number");
			}else if (checkNegative == 0) {
					System.out.println("zero is neither a negative or a positive number");
			}else {
				System.out.println("Negative number");
				} 
			}
}

}