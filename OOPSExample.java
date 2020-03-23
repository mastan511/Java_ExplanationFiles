//OverLoading Example
class OOPSExample 
{

	void sum(int a,int b){
		System.out.println(a+b);
	}
	void sum(float a,float b){
		System.out.println(a+b);
	}
	void sum(double a,double b){
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		OOPSExample o=new OOPSExample();
		o.sum(1,3);
		o.sum(2.5,2.5);
		o.sum(2.55,2.55);
	}
}
