
public class words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I got Job";
		int count=0;
		System.out.println(s.indexOf(' ',3));
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				
				
				count++;
			}
			System.out.println('\n');
		}
		count++;
		System.out.println(count);
	}

	}


