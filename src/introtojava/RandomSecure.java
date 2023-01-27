package introtojava;
import java.security.SecureRandom;
import java.util.Scanner;
public class RandomSecure {
	public static int[] Generator(int length) {
		SecureRandom otp = new SecureRandom();
		int[] array = new int[length];
		for(int i= 0; i< length ; i++){
		    array[i] = otp.nextInt(10);   
		}
		return array;
	}
	public static int Arraytoint (int[] values) {
		int transformed = 0;
		for (int i = 0; i < values.length; i++) {
			transformed += values[i] * Math.pow(10, values.length-i-1);
		}
		return transformed;
	}

	public static void main(String[] args) {
		System.out.println("Enter the lengtgh of the random number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int[] randArray = Generator(num);
		int randGenerated = Arraytoint(randArray);
		System.out.println("random number gerated for length: "+ num+ " is:"+ randGenerated );
		// TODO Auto-generated method stub
		;
		 
	}

}
 