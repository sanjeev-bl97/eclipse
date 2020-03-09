import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class arayylisit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <String> a =new ArrayList<String>();
        a.add("Sanjeev");
        a.add("San");
        a.add("jeev");
        
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
