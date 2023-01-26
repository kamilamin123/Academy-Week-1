package introtojava;
import java.util.Scanner;
public class StepsNumber {
	public static void main(String[] args) {
		System.out.println("enter the number between 0 and 106: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int step = 0;
		if (num >= 0 && num <= 106) {
			int i = num ;
			while(i>0) {
				step++;
				if (i%2==0) {
					i /=2;
				}else {
					i--;
				}
			}
			System.out.println("for "+ num +" number of steps: "+step);
		}else {
			System.out.println("Out of range");
		}
		
	}

}
