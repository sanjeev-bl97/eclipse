import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sa=0;
		 Scanner s=new Scanner(System.in);
		System.out.println("Enter no of values");
		  i=s.nextInt();
         int n[] =new int[i] ;
         System.out.println("Enter numbers");
         for(int u=0;u<i;u++)
         {
        	 
        	 n[u]=s.nextInt();
         }
       System.out.println("Odd numbers are ");
         for(int u=0;u<i;u++)
         {
        	 
        	   if(n[u]%2!=0)
        	   {
        	      sa= sa +n[u];
        	      System.out.println(n[u]);
        	   }
        	   
        	   
         }
         System.out.println("Sum of odd numbers "+sa);
         
	}

}
