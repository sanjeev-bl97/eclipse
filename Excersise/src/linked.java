import java.util.*;


public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList <Integer> a =new LinkedList<Integer>();
	        a.add(12);
	        a.add(856);
	        a.add(8);
	        a.add(172);
	        a.add(34);
	        a.add(34);
	        a.removeFirst();
	        System.out.println(a);
	       ListIterator b=a.listIterator();
	       while(b.hasNext())
	       {
	    	   System.out.println(b.next());
	    	   
	    	   
	       }
	       while(b.hasPrevious())
	       {
	    	   System.out.println(b.previous());
	    	   
	    	   
	       }
		}

	}


