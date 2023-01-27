package introtojava;

import java.util.Scanner;
public class SwitchStatment {
	public static void main(String[] args) {
		System.out.println("enter the number between 0 and 5 any number else to end the program: ");
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("number 1");
				continue;
			case 2:
				System.out.println("number 2");
				continue;
			case 3:
				System.out.println("number 3");
				continue;
			case 4:
				System.out.println("number 4");
				continue;
			case 5:
				System.out.println("number 4");
				continue;
			default:
				break;
			}
			scan.close();
			break;
		}
		
	}

}


