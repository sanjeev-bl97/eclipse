
class b1
{
	
void get()
{
	System.out.println("class b1");
}



}

class b2 extends b1
{
	
void get()
{
	System.out.println("class b2");
}



}




public class methodover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

methodover b=new methodover();
b1 d=new b1();
b2 f=new b2();
d.get();
f.get();
b.show();
b.show("sanjeev");

	}
	
	void show()
	
	{
		
		
		System.out.println("Method1");
	}
void show(String a)
{
	System.out.println(a);
}
}
