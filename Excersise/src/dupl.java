import java.util.Scanner;

public class dupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
        int b;
        int c=a.length;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no");
        for(int i=0;i<c;i++)
        {
        	
        	a[i]=s.nextInt();
        }
        for(int i=0;i<c;i++)
        {
        	for(int j=i+1;j<c;j++)
        	if(a[i]==a[j])
        		
        	{   a[i]=a[c-1];
        	    c--;
        	    
        	 }
        		  }
        System.out.println("The no are");
        for(int i=0;i<c;i++)
        	
        {
        	
        	System.out.println(a[i]);
        }
        
}


	}


