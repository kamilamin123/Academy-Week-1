package introtojava;
import java.util.Scanner;
public class MeterConvertor {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input distance in meters: ");
		float meter = scanner.nextFloat();
		System.out.print("Input hour: ");
		float hour = scanner.nextFloat();
		System.out.print("Input minutes: ");
		float minute = scanner.nextFloat();
		System.out.print("Input seconds: ");
		float second = scanner.nextFloat();
		float totalSeconds =(hour*60*60)+(minute*60)+(second);
		System.out.println("Your speed in meters/second is " + (meter/totalSeconds));
		System.out.println("Your speed in km/h is " + ((meter*60*60/1000)/totalSeconds));
		System.out.println("Your speed in miles/h is " + ((meter*60*60/1609)/totalSeconds));
		scanner.close();
	}
}

