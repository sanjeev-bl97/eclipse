package dayseven;

public class student {
	   int rno;
	   String name;
	   int java;
	   int maths;
	   float avg;
	   
	   public student (int rno,String name,int java,int maths)
		{
			this.rno=rno;
			this.name=name;
			this.java=java;
			this.maths=maths;
			
		}
	   public void cal()
	   {
		   avg=(java+maths)/2;
		   
	   }
}
