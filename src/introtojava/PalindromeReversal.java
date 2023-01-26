package introtojava;
import java.util.Scanner;
public class PalindromeReversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to check Palindrome");
		String ordered = scan.nextLine();
		scan.close();
		ordered = ordered.toLowerCase();
		int length = ordered.length();
		String reversed=new String();
		for (int i = 0; i <= (length-1); i++) {
			reversed += ordered.charAt(length-1-i);
			
		}
		System.out.println(reversed);
		if (reversed.equals(ordered)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	
	}

}
