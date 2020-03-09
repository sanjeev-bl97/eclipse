import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(int i=0;i<5;i++) {
        	a[i]=scanner.nextInt();
        }
        System.out.println("\nThe odd numbers are ");
        for(int i=0;i<5;i++) {
        	if(a[i]%2!=0)
        	{   b++;
        		System.out.println(a[i]);
        	}
        }
        System.out.println("\nThe count of odd numbers are "+b);
        	
        }
        
	}


