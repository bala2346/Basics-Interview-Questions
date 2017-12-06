package cracking_the_code_interview;
import java.util.*;
public class Permutation {
	
	static String sort(String s)
	{
		char[] content=s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	
	public static boolean permutation(String str,String src)
	{
		if(str.length() !=src.length())
		{
			return false;
		}
		return sort(str).equals(sort(src));
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		System.out.println("Enter the pemutation of same String");
		String src=sc.next();
		System.out.println(permutation(str,src));
	}

}
