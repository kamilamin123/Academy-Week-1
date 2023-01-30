package introtojava;
import java.util.Scanner;
public class Plural {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    int amt = inp.nextInt();
	    inp.nextLine(); //this line is necessary
	    System.out.print("word:");
	    String word = inp.nextLine();
	    String plur="" ;
	    if (amt==1){
	        System.out.println(amt+" "+ word);
	    }else {
	    	if (word.endsWith("fe")) {
	    		plur = word.replace("fe", "ves");
	    	} else if ((word.endsWith("ay"))||(word.endsWith("oy"))  || (word.endsWith("ey")) || ( word.endsWith("uy"))) {
	    		plur= word+"s";
	    	} else if ((word.endsWith("sh"))||(word.endsWith("ch"))) {
	    		plur= word+"es";
	    	} else if (word.endsWith("y")) {
	    		plur = word.replace("y", "ies");
	    	}else if (word.endsWith("us")) {
	    		plur = word.replace("us", "i");
	    	}else {
	    		plur= word+"s";
	    	}
	    	System.out.println(amt+" "+ plur);
	    }
	    inp.close();

	}

}
