import java.util.*;


public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> a =new HashSet<Integer>();
        a.add(12);
        a.add(856);
        a.add(8);
        a.add(172);
        a.add(34);
        a.add(34);
        a.remove(34);
        System.out.println(a);
        Iterator b=a.iterator();
       while(b.hasNext())
       {
    	   System.out.println(b.next());
    	   
    	   
       }
	}
	}


