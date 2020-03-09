import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
		
		double newr, oldr,read,d;
		System.out.println("Enter the old meter reading and new meter reading");
		Scanner scanner= new Scanner(System.in); 
		oldr=scanner.nextDouble();
		newr=scanner.nextDouble();
		read=newr-oldr;
		System.out.println("Consumed Units="+read);
		if(read>=1 && read<=100)
		{
			System.out.println("Charge is free");
		}
		else if(read>=101 && read<=200)
		{
			System.out.println("Charges="+read*2);
		}
		else if(read>=201 && read<=300)
		{
			System.out.println("Charges="+read*3);
		}
		else if(read>=301 && read<=400)
		{
			System.out.println("Charges="+read*4);
		}
		else if(read>=401)
		{   d=read/10;
			System.out.println("Charges="+read*5+d);
		}
		else {
			System.out.println("Invalid input");
		}
	
	}
}
