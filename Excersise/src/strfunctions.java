
public class strfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="I  got Job";
       
        
        String s3="cts",s4="Cts",s5="tsd";
        String s2=s.substring(3);
        System.out.println(s2);
        
        System.out.println(s3.compareTo(s4));
        
        System.out.println(s3.compareTo(s5));
        
        System.out.println(s3.equals(s4));
        
        if(s3.equalsIgnoreCase(s4))
        {
        	
        	
        	System.out.println("Equal");
        	
        }
	}

}
