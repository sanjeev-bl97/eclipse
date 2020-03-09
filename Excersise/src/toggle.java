import java.util.Scanner;

public class toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter");
		a=s.nextLine();
		char [] b=a.toCharArray();
		for(int i=0;i<a.length();i++ )
		{
		if(b[i]>='A' && b[i]<='Z')
		{
			b[i]=(char)((int)b[i]+32);
		}
		else if(b[i]>='a' && b[i]<='z')
		{
			b[i]=(char)((int)b[i]-32);
			
		}
		System.out.print(b[i]);
		}
		
		
		

	}

}
