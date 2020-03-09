import java.util.Scanner;

public class reverseno {
	public static void main(String[] args) {
		
		
		int a=0,b=0,c=0;
		Scanner scanner=new Scanner(System.in);
        
     
        System.out.println("Enter the  number");
        a=scanner.nextInt();
       while(a!=0)
       {b=a%10;
        c=c*10+b;
        a/=10;
        
    	   
    	   
       }
		
		System.out.println(c);
	}
}
