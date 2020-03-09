import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter number");
         a=scanner.nextInt();
         if(a>=0)
         {
        	 System.out.println("Entered number is positive");
         }
         else
         {
        	 System.out.println("Entered number is negative");
         }
	}

}
