import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        a=scanner.nextLine();
        System.out.println("\nCaptial letter "+a.toUpperCase());
        System.out.println("\nSmall letter "+a.toLowerCase());
	}

}
