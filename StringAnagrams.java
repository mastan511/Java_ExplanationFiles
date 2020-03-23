/* String 
=====
string1 , string2
1.Two strings length must be equal 
2.All the characters in string1 must be available in string 2 
	then oly the both strings are anagrams
	ex : str1 = abc
	     str2 = cba
	     the above strings are anagrams

		 */

import java.util.*;
class StringAnagrams
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int c =0;
		int s1len = s1.length();
		int s2len = s2.length();
		if (s1len!=s2len)
		{
			System.out.println("Not Anagrams");
		}else{
		
		for (int i = 0;i<s1len;i++)
		{
			for (int j = 0;j<s2len;j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					c++;
				}
			}

		}

		if(c == s1len){
		System.out.println("Both Strings are Anagrams");
		}else{
		
		System.out.println("Not Anagrams");
		}
		
		}


	}
}
