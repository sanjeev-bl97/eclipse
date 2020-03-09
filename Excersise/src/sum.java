import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c=0,d=0,e=0;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=a;
		while(a!=0)
		{
			d=a%10;
			if(d%2!=0)
			{
				e=e+d;
				
			}
			a=a/10;
		}
		System.out.println(e);

	}

}
