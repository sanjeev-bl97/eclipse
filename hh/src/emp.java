

 class employee {
	
	
	
	public int empno=298;
	void display()
	{
		System.out.println(empno);
		
	}
	void display(int a)
	{
		
		System.out.println(a);
	}
	void display(int a,String b)
	{
		
		System.out.println(b);
	}
	}
 
 public class emp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        employee e1 = new employee();
        e1.display();
        e1.display(1);
        e1.display(12,"san");
	}
}

