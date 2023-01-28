package introtojava;
import java.util.Scanner;
public class StringMenu {
	static Scanner scanner = new Scanner(System.in);
	public static void Palindrome () {
		System.out.print("Enter the String to check Palindrome\n");
		scanner.nextLine();
		String str1 = scanner.nextLine();
		int pointer = str1.length()-1;
		boolean check = true;
		for (int i=0; i<=pointer; i++,pointer--) {
			if (!((str1.charAt(i))==(str1.charAt(pointer)))) {
				System.out.println(str1+" is not a palindrome");
				check =false;
				break;
			}
		}
		if (check==true) {
			System.out.println(str1+" is  a palindrome");
		}	
	}
	public static void Reverse () {
		System.out.print("Enter the String to reverse it\n");
		scanner.nextLine();
		String str1 = scanner.nextLine();
		String rev = "";
		for (int i=(str1.length() -1); i>=0; i--) {
			rev += str1.charAt(i);
		}
		System.out.println("The Reverse of the string "+str1+" is "+rev);
	}
	public static void  Concatenate () {
		System.out.print("Enter the first string\n");
		scanner.nextLine();
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string\n");
		String str2 = scanner.nextLine();
		System.out.println("The Concatenation of two string1"+str1+" + "+str2+" = "+str1+str2);
	}
	public static void Comparison () {
		System.out.print("Enter the first string\n");
		scanner.nextLine();
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string\n");
		String str2 = scanner.nextLine();
		if (str1.equals(str2)) {
			System.out.println("The entered strings are equal");
		}else {
			System.out.println("The entered strings are not equal");
		}
	}
	public static void Length () {
		System.out.print("Enter the String to reverse it\n");
		scanner.nextLine();
		String str1 = scanner.nextLine();
		System.out.println("The length of the "+str1+" is "+(str1.length()));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("/................String Menu................/\n"
					+ "Press 1 for Palindrome Check\n"
					+ "Press 2 to reverse a String\n"
					+ "Press 3 to Concatenate two Strings\n"
					+ "Press 4 for String Comparison\n"
					+ "Press 5 to Calculate the Length of String\n"
					+ "Enter the option:");
			int cal = scanner.nextInt();
			if (cal==1) {
				System.out.print("Palindrome Check\n");
				StringMenu.Palindrome();
			}else if (cal==2) {
				System.out.print("String Reverse\n");
				StringMenu.Reverse();
			}else if (cal==3) {
				System.out.print("String Concatenation\n");
				StringMenu.Concatenate();
			}else if (cal==4) {
				System.out.print("String Comparison\n");
				StringMenu.Comparison();
			}else if (cal==5) {
				System.out.print("Length of a string\n");
				StringMenu.Length();
			}else {
				continue;
			}
			
			System.out.println("To continue String operation Press 1 else Press any button to exit");
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