package dayseven;

public class throwex {

	public void f1() throws ArithmeticException
	{
		System.out.println("in f1 before");
		int a=10,b=0,c;
		c=a/b;
		
		System.out.println("in f1-after");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("in main-before");
    try{
    	throwex te =new throwex();
    	te.f1();
    }
    catch(ArithmeticException a)
    {
    	System.out.println("in ar catch");
    	
    	
    }
    
    System.out.println("in main-after");
	}

}
