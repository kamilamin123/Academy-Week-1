package introtojava;
import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter your name: ");
		    String name = scanner.nextLine();
		    if(name.length() > 20) {
		    	System.out.println("Please enter a name with < 20 chars");
		    	

	}
	

}}
