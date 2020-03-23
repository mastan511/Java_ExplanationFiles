import java.util.*;
class Main
{
    public static void main(String aaa[])
    {
            Scanner sc=new Scanner(System.in);        
            ArrayList <Integer>a=new ArrayList<Integer>();
			ArrayList <Integer>b=new ArrayList<Integer>();
            while(sc.hasNext())
            {
                a.add(sc.nextInt());
				b.add(sc.nextInt());
				
              //if (a.get(n) == '\n'))
              //{
				 // break;
              //}  
              
            }
			   
            for(int i=0;i<a.size();i++)
            {
                System.out.print(a.get(i));
               
            }
                System.out.println("****************************");
               
            for(int i=0;i<b.size();i++)
                System.out.println(b.get(i));
    }
}
