import java.util.Scanner;

public class des {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]=new int[5];
            int b;
            
            Scanner s=new Scanner(System.in);
            System.out.println("Enter no");
            for(int i=0;i<5;i++)
            {
            	
            	a[i]=s.nextInt();
            }
            for(int i=0;i<5;i++)
            {
            	for(int j=i+1;j<5;j++)
            	if(a[i]<a[j])
            		
            	{   b=a[i];
            		a[i]=a[j];
            		a[j]=b;
            		
            		
            	}
            		
            }
            System.out.println("The no are");
            for(int i=0;i<a.length;i++)
            	
            {
            	
            	System.out.println(a[i]);
            }
            
	}

}
