package introtojava;
public class Fibonacci{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a = 0;
	System.out.println(a);
	int b = 1;
	System.out.println(b);
	int c = 0;
	while (c < 34) {
		c = a + b ;
		a = b;
		b = c;
		System.out.println(c);
	}			
}
}
		


