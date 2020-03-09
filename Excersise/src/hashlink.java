import java.util.*;


public class hashlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <Float> a =new LinkedHashSet<Float>();
        a.add( 12.1f);
        a.add(856f);
        a.add(8f);
        a.add(172f);
        a.add(34f);
        a.add(34f);
        a.remove(3f);
        System.out.println(a);
        Iterator b=a.iterator();
       while(b.hasNext())
       {
    	   System.out.println(b.next());
    	   
    	   
       }
	}
	}


