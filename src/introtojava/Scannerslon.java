package introtojava;
import java.util.Scanner;
public class Scannerslon {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
		String userName;
		Boolean newUser;
		byte num1;
		double num2;
		float num3;
		int num4;
		long num5;
		short num6;
		System.out.print("Input username and press Enter: ");
	    userName = scan.nextLine();
	    System.out.print("are you new user true or false: ");
	    newUser = scan.nextBoolean();
	    System.out.print("Input number between -126 to 127: ");
	    num1 = scan.nextByte();
	    System.out.print("Input number ufficient for storing 15 decimal digits: ");
	    num2 = scan.nextDouble();
	    System.out.print("Input number Sufficient for storing 6 to 7 decimal digits: ");
	    num3 = scan.nextFloat();
	    System.out.print("Input number from -2,147,483,648 to 2,147,483,647: ");
	    num4 = scan.nextInt();
	    System.out.print("Input number  from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807: ");
	    num5 = scan.nextLong();
	    System.out.print("Input number from -32,768 to 32,767: ");
	    num6 = scan.nextShort();
	    System.out.println("the user name: "+ userName);
	    System.out.println("is it new user: "+ newUser);
	    System.out.println("byte : "+ num1);
	    System.out.println("double : "+ num2);
	    System.out.println("float : "+ num3);
	    System.out.println("int : "+ num4);
	    System.out.println("long : "+ num5);
	    System.out.println("short: "+ num6);
	    
	    
		// TODO Auto-generated method stub

	}}

}
