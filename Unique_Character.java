package cracking_the_code_interview;
import java.util.*;
public class Unique_Character 
{
	public static boolean unique_check(String src)
	{
		boolean[] char_set=new boolean[256];
		for (int i = 0; i < src.length(); i++) 
		{
			int val=src.charAt(i);
			if(char_set[val])
			{
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String check weather its uniqe are not:");
		String src=sc.next();
		System.out.println(unique_check(src));
	}

}
