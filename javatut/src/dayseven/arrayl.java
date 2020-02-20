package dayseven;

import java.util.ArrayList;

public class arrayl {

	 ArrayList<student> std = new ArrayList<student>();
	 
	 
	 public void create()
	 {
		 student s1=new student(101,"Sanjeev",78,98);
		 student s2=new student(102,"Viki",98,99);
		 s1.cal();
		 s2.cal();
		 std.add(s1);
		 std.add(s2);
		 
		 
	 }
	 public void display()
	 {
		 for(student s:std)
		 {System.out.println("\nName:" + s.name+"\nID " + s.rno +"\nJava: "+s.java+"\nMaths: "+s.maths+"\nAverage: "+s.avg);
	   }
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     arrayl a=new arrayl();
     a.create();
     a.display();
	}

}
