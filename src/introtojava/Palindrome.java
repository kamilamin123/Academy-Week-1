package introtojava;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to check Palindrome");
		String ordered = scan.nextLine();
		scan.close();
		ordered = ordered.toLowerCase();
		int length = ordered.length();
		int check = 0;
		int pointer = length - 1; 
		for (int i = 0; i <= pointer; i++) {
			if (ordered.charAt(i) != ordered.charAt(pointer)) {
				check = 1;
			}
			pointer--;
		}
		if (check == 0) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	
	}

}

