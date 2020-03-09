import java.util.*;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm= new Hashtable<Integer,String>();
	     
		  
		  hm.put(1,"san");
		  hm.put(7,"h");
		  hm.put(5,"n");
		  hm.put(3,"s");

		  
		  System.out.println(hm);
		  
		  for(Map.Entry<Integer,String>mentry:hm.entrySet())
		  System.out.println("Key:"+mentry.getKey()+"\t Value:"+mentry.getValue());
			}
	}


