package javatut;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           bank b;
           b=new hdfc();
          System.out.println( "Rate of interest of HDFC= "+b.get_noi());
          b=new axis();
          System.out.println( "Rate of interest of Axis= "+b.get_noi());
         
	}

}
