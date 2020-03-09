import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a;
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter number");
             a=scanner.nextInt();
             if(a%7==0)
             {
            	 System.out.println("The number is divisble"); 
             }
             
             else
             {
            	 
            	 System.out.println("The number is not divisble");
             }
	}

}
