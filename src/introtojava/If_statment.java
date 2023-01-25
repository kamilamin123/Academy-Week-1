package introtojava;

public class If_statment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 17;
	   	
	  	if(num % 2 == 0) {
	  		System.out.println("Even number");
	  	}else {
	  		System.out.println("Odd number");
	  	}
	  	num = 9;
	   	
	  	if(num < 10 && num < 30) {
	  		System.out.println("Hello");
	  	}
	  	if(num == 22) {
	  		System.out.println("Hi");
	  	}
	   	
	  	if(num > 100) {
	  		System.out.println("Meci");
	  	}else if(num == 22 || num < 10) {
	  		System.out.println("Holla");
	  	}else {
	  		System.out.println("Bonjour");
	  	}
	  	num = 100;
	   	
	  	if(num <= 22) {
	  		if(num >=0 && num < 10) {
	  			System.out.println("Hello");
	  		}else if (num < 5) {
	  			System.out.println("Hi");
	  		}else {
	  			System.out.println("Meci");
	  		}
	  	}else if (num > 10 && num < 20) {
	  		if(num % 2 == 2) {
	  			System.out.println("Bonjour");
	  		}else if(num == 12) {
	  			System.out.println("Namaste");
	  		}
	  	}else {
	  		System.out.println("Holla");
	  	}
	   	
			
	  }

	

}
