import java.util.*;
public class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrimeNumber c = new PrimeNumber();
		int nofPrimes = 0;
		int sum = 0;
		int lb = sc.nextInt();
		int ub = sc.nextInt();
		for (int i=lb;i<=ub;i++)
		{

			//System.out.println(i);
          	boolean b=c.isPrime(i);
			if(b==true){
			System.out.println(i);
				nofPrimes+=1;
				sum+=i;
			}
			
			
		}
		
		float avg = sum/nofPrimes;
		System.out.println(avg);

	
	
	}


	public boolean isPrime(int num){
	int count = 0;
	for (int i=1;i<=num;i++)
	{
		if (num%i==0)
		{
			count+=1;
		}
	}

		if (count == 2)
		{
			return true;
		}else{
			return false;
			
			}
	
	}

}