import java.util.*;
class Anagram
{
	
	public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
		 String st1 = sc.next();
		 String st2 = sc.next();
		 int st1l=st1.length();
		 int st2l = st2.length();
		 int c = 0;
		 if (st1l == st2l)
		 {
			 for (int i=0;i<st1l;i++)
			 {
				 for (int j = 0;j<st2l;j++)
				 {
					 if (st1.charAt(i) == st2.charAt(j))
					 {
						 //System.out.println(st1.charAt(i)+" "+st2.charAt(j));
						 c+=1;
					 }
				 }
			 }

				if (c == st1.length())
				{
					System.out.println("Anagram");
				}
				else
				{
					System.out.println("Not Anagram");
						 
				}
				

			
		 }else{
		 
		 System.out.println("Both the String lengths must be the same");
		 }


	
	}
}