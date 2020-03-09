public class abstractv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         derived a1= new derived();
         a1.display();
         a1.displayName();
         a1.result();
	}
	}

  interface inter{
	
	void result();
	
	
}
	 abstract class base  implements inter
     {
   	  int empNo=1000;
   	  String empName="Sanjeev";
   	  abstract void display();
   	  
   	 public  void result()
   	  {
   		  
   		  System.out.println("pass");
   	  }
   	  
   	  void displayName()
   	  {
   		  
   		  System.out.println("Name:"+empName);
   	  }
   	  
     }
	 class derived extends base{
		 
		  void display()
		  {
			 
			 System.out.println("in derived class");
		 }
		  
	 }
