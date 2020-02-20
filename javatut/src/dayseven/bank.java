package dayseven;

public class bank {

	public static void main(String[] args) {
          abstract1 a;
          a=new icici();
          a.show();
          a=new hdfc();
          System.out.println("HDFC roi:"+a.get_roi());
          a=new icici();
          System.out.println("ICICI roi:"+a.get_roi());
 
	}

}
