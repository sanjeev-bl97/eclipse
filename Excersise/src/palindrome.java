import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=0,b=0,c=0,temp=0;
		Scanner scanner=new Scanner(System.in);
        
     
        System.out.println("Enter the  number");
        a=scanner.nextInt();
        temp=a;
       while(a!=0)
       {
    	   
    	   b=a%10;
           c=c*10+b;
           a/=10;
        
    	   }
       
      
       if(temp==c)
       {
    	   System.out.println(c+"\t is a palindrome");
    	   
       }
       else
       {
    	   
    	   System.out.println(c+"\t is not a palindrome");
       }
		
		

	}

}
