package introtojava;
import java.util.Scanner;
public class Colossal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
	    String command = scan.nextLine();
	    if (command.equals("n")) 
	    {
	        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	    }else if(command.equals("s")){
	    	System.out.println("The stream flows out through a pair of 1 foot diameter sewer pipes");
	    }else if (command.equals("e")) {
	    	System.out.println("snake room");
	    }else if(command.equals("w")){
	    	System.out.println("westworld");
	    }else {
	    	System.out.println("end of the road");
	    }
	    // Add else-ifs for s, e, and an else for any other input. Be creative!
	    
	    
	    System.out.println("End of adventure!");   
	    scan.close();
	  }
	}


