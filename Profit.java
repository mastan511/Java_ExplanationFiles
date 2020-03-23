import java.util.*;
class Profit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int x_min = sc.nextInt();
		int y_max = sc.nextInt();
		for (int i=x_min;i<=y_max;i++)
		{
			c+=i;
		}

		System.out.println(c);

		
	}
}