import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b="";
		int c;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        a=scanner.nextLine();
        c=a.length();
        for(int i=c-1;i>=0;i--)
        {
        	b=b+a.charAt(i);
        	
        }
        System.out.println(b);
	}

}
