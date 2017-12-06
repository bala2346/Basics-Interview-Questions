package cracking_the_code_interview;
import java.util.*;
public class Charcterchek {
	
	public static boolean Char_check(String str,String src)
	{
		if(str.length()==src.length())
		{
			return oneEditReplace(str,src);
		}
		if(str.length()+1==src.length())
		{
			return oneEditInsert(str,src);
		}
		if(str.length()-1==src.length())
		{
			return oneEditInsert(src,str);
		}
		return false;
	}
	
	static boolean oneEditReplace(String str,String src)
	{
		boolean differenceBound=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=src.charAt(i))
			{
				if(differenceBound)
				{
					return false;
				}
				differenceBound=true;
			}
		}
		return true;
	}
	static boolean oneEditInsert(String str,String src)
	{
		int index1=0;
		int index2=0;
		while(index2<src.length() && index1<str.length())
		{
			if(str.charAt(index1)!=src.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		System.out.println("Enter the String:");
		String src=sc.next();
		System.out.println(Char_check(str,src));
	}

}
