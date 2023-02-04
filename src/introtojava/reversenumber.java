package introtojava;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x= true;
		Scanner scan = new Scanner(System.in);
		while(x) {
			System.out.println("enter number to reverse or 0 to end the program:");
			int num = scan.nextInt();
			switch (num) {
			case 0:
				x=false;
				break;
			default:
				int  reverse = 0;
				int temp;
				while(num != 0) {
					temp = num % 10;
					reverse= reverse*10+temp;
					num= num/10;
					
				}
				System.out.println("\n"+reverse);
			}
			
			
			
			
		}
		scan.close();
		
		
		

	}

}
