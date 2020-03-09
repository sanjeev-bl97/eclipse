
public class sum36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] n= {21,14,7,15,-2,15,22,9,6};
      
      
      for(int i=0;i<9;i++)
      {for(int j=i+1;j<9;j++)
      {
    	  if(n[i]+n[j]==36)
    	  {
    		  System.out.println(n[i]+"+"+n[j]+"=36");
    		  
    	  }
    	  
    	  
      }
    	  
    	  
      }
	}

}
