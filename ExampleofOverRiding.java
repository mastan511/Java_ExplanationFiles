class Mastan
{
	void test(){
	System.out.println("From Mastan Class");
	}
}


//
class ExampleofOverRiding extends Mastan 
{

	void test(){
	System.out.println("From ExampleofOverRiding class");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Mastan m=new Mastan();
		m.test();
		ExampleofOverRiding m1=new ExampleofOverRiding();
		m1.test();
	}
}
