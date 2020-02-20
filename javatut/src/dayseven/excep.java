package dayseven;

public class excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10,b=0,c;
     
     try {c=a/b;
    	 int []arr= {1,2,3};
    	 System.out.println(arr[4]);
    	 
    	 System.out.println(c);
    	 
     }
     
     catch(ArithmeticException ae)
     {
    	 System.out.println("In arithmetic catch");
    	 System.out.println(ae);
    	
    	 
     }
     catch(ArrayIndexOutOfBoundsException aie)
     {
    	 System.out.println("In array catch");
    	 System.out.println(aie);
    	 
     }
     finally {
         System.out.println("sd");}
	 
     
     System.out.println("After catch");
	}

}
