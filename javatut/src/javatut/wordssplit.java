package javatut;

public class wordssplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I got Job";
		int p1=0,p2=0;
		
		    p1=0;
			p2=s.indexOf(' ',p1);
			System.out.println(s.substring(p1,p2));
			
			 p1=p2+1;
				p2=s.indexOf(' ',p1);
				System.out.println(s.substring(p1,p2));
				
				
				 p1=p2+1;
					p2=s.indexOf(' ',p1);
					if(p2==-1)
					{p2=s.length();
					System.out.println(s.substring(p1,p2));}
					
					
			
			
			
			
		
	}

}
