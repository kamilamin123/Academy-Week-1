package introtojava;
import java.util.Scanner;
public class MeterConvertor {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Please put number in");
int x = scanner.nextInt();
int fact = 100;
for (int i = 10; i >=1; i--)
{
fact=fact-i;
System.out.println(fact);
}
System.out.println(" Factorial of " + x + " is: " + fact);
scanner.close();
}
 }

