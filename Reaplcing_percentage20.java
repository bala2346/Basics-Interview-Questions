package cracking_the_code_interview;
import java.util.*;
public class Reaplcing_percentage20 
{
//	public static void replacing_20(String src)
//	{
//		String str=src.replaceAll(" ","%20");
//		System.out.println(str);
//		
//		
//	}
	public static void replacing_20(String src,int truelength)
	{
		char[] s=src.toCharArray();
		int countSpace=0,index,i=0;
		for(i=0;i<truelength;i++)
		{
			if(s[i]==' ')
			{
				countSpace++;
			}
			index=truelength+countSpace*2;
			if(truelength<src.length())
				s[truelength]='\0';
			for(i=truelength+1;i>=0;i--)
			{
				if(s[i]==' ')
				{
					s[index-1]='0';
					s[index-2]='2';
					s[index-3]='%';
					index=index-3;
				}
				else
				{
					s[index-1]=s[i];
					index--;
				}
			}

		}
		System.out.println(s.toString());
	}
	
 
 public static void main(String[] args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String src=sc.nextLine();
	int n=src.length();
	replacing_20(src,n);
 }
}
