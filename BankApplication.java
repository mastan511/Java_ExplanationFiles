/*1.SBI - > 7% ==> 7/100=0.07
2.ICICI - > 8%==> 8/100 = 0.08
3.HDFC -> 9%==>0.09

PTR/100
P = Amount
T = Months
R = */
import java.util.*;
class BankApp
{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	double sbiRate = 7;
	double iciciRate = 8;
	double hdfcRate = 9;
	int amount = sc.nextInt();
	int time = sc.nextInt();
	System.out.println("Slecet the Bank :\n 1.Sbi \n 2.ICICI \n 3.HDFC");
	int choice = sc.nextInt();
	switch(choice){
	case 1:
		double sbiIntrest = BankApp.sbi(amount,time,sbiRate);
	System.out.println("As per SBI Norms Intrest is :"+sbiIntrest);
	break;
	case 2:
		double iciciIntrest = BankApp.icici(amount,time,iciciRate);
	System.out.println("As per ICICI Norms Intrest is :"+iciciIntrest);
	break;
	case 3:
		double hdfcIntrest = BankApp.hdfc(amount,time,hdfcRate);
	System.out.println("As per HDFC Norms Intrest is :"+hdfcIntrest);
	break;
	default:
		System.out.println("Invalid Choice ");
		
	}

	}
	
	public static double sbi(int p,int t,double r){
		double intrest = p*t*r/100;
		return intrest;
	}

	public static double icici(int p,int t,double r){
		double intrest = p*t*r/100;
		return intrest;
	}

	public static double hdfc(int p,int t,double r){
		double intrest = p*t*r/100;
		return intrest;
	}

}