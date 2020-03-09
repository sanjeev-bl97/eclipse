import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no");
		int a=s.nextInt();
		String[] arr=new String[a];
		
		System.out.println("Enter the words");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.next();
			
			
		}
		System.out.println("The words are");
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
