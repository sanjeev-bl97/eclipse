import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer,String> hm= new HashMap<Integer,String>();
     
  
  hm.put(1,"san");
  hm.put(7,"h");
  hm.put(5,"n");
  hm.put(3,"s");

  hm.put(null,null);
  hm.put(null,"s");
  System.out.println(hm);
  
  for(Map.Entry<Integer,String>mentry:hm.entrySet())
  System.out.println("Key:"+mentry.getKey()+"\t Value:"+mentry.getValue());
	}

}
