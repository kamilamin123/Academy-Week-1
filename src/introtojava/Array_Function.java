package introtojava;

public class Array_Function {
	public static void multiplyArray(int[] values,int num) {
	       for(int i=0;i<values.length;i++) {
	           values[i]*=2;
	           
	       }
	    public static void printArray() {
	    	for (int i =0; i<values.length; i++) {
	    		System.out.printl(values[i]);
	    	}

	  public static void main(String[] args) {
	      int[] numArray =  {3, 4, 5, 6, 7};
	      int[] numArray1={2,4,6,8,10};
	      printArray(numArray);
	      multiplyArray(numArray,2);
	      printArray(numArray);
	      printArray(numArray1);
	      multiplyArray(numArray1,2); 
	      printArray(numArray1);
	   }

	   
	    }
	   }
	}