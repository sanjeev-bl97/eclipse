import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           final double pi = 3.14;
           float r,a;
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter radius");
           r=scanner.nextFloat();
           a=(float)pi*r*r;
           System.out.println("\nArea of circle is...... "+a);
           
           
	}

}
