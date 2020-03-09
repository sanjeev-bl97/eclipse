import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b=1;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        a=sc.nextInt();
        for(int i=1;i<=a;++i)
        {
        	
        	b=b*i;
        }
        System.out.println(b);
	}

}
