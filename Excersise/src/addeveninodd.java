
public class addeveninodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     int []a = {91,22,28,84,37,63,44,32};
     int b=0;
     
     for(int i=0;i<=7;i++)
     {
    	 if(i%2==0)
    	 {
    		 if(a[i]%2==0)
    		 {
    			 System.out.println(a[i]);
    			 b+=a[i];
    			 
    		 }
    		 
    	 }
     
     }
     System.out.println(b);
	}

}
