package introtojava;
import java.util.Scanner;
public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	public static void Addition () {
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		System.out.println("The addition of the numbers "+num1+" + "+num2+" = "+(num1 + num2));
	}
	public static void Subtraction () {
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		System.out.println("The subtraction of the numbers "+num1+" - "+num2+" = "+(num1 - num2));
	}
	public static void Multiplication () {
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		System.out.println("The product of the numbers "+num1+" * "+num2+" = "+(num1 * num2));
	}
	public static void Division () {
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		System.out.println("The Division of the numbers "+num1+" / "+num2+" = "+(num1 / num2));
	}
	public static void Square () {
		System.out.println("Enter the number you want the square for");
		double num1 = scanner.nextDouble();
		System.out.println("The square of "+num1+ " = "+(num1 * num1));
	}
	public static void SquareRoot () {
		System.out.println("Enter the number you want the square root for");
		double num1 = scanner.nextDouble();
		System.out.println("The square root of "+num1+ " = "+(Math.pow(num1, .5)));
	}
	public static void Reciprocal () {
		System.out.println("Enter the number you want the Reciprocal for");
		double num1 = scanner.nextDouble();
		System.out.println("The Reciprocal of "+num1+ " = "+(1 / num1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("/................Calculator Menu................/\n"
					+ "Press 1 for addition\n"
					+ "Press 2 for subtraction\n"
					+ "Press 3 for Multiplication\n"
					+ "Press 4 for Division\n"
					+ "Press 5 for finding Square\n"
					+ "Press 6 for finding Square root\n"
					+ "Press 7 for finding Reciprocal");
			int cal = scanner.nextInt();
			if (cal==1) {
				Calculator.Addition();
			}else if (cal==2) {
				Calculator.Subtraction();
			}else if (cal==3) {
				Calculator.Multiplication();
			}else if (cal==4) {
				Calculator.Division();
			}else if (cal==5) {
				Calculator.Square();
			}else if (cal==6) {
				Calculator. SquareRoot();
			}else if (cal==7) {
				Calculator.Reciprocal();
			}else {
				continue;
			}
			
			System.out.println("To continue calculation Press 1 else Press any button to exit");
			int exit = scanner.nextInt();
			if (exit == 1) {
				continue;
			}else {
				break;
			}
		}
		scanner.close();
	}
}