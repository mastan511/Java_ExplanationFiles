import java.util.*;
class EvenorOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0){
		System.out.print("The given number is Even");
		}else{
		System.out.print("Odd");
		}
	}
}
