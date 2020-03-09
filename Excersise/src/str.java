import java.util.Scanner;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String s1="aic";
              char a;
              
              String s2="ABC";
              Scanner sc = new Scanner(System.in);
              a=sc.next().charAt(0);
              System.out.println(s1==s2);
              System.out.println(s1.equals(s2));
              System.out.println(s1.compareTo(s2));
	}

}
