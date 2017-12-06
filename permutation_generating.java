package cracking_the_code_interview;
import java.util.*;
public class permutation_generating {
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String src=sc.next();
		int n=src.length();
		permutation_generating permut=new permutation_generating();
		permut.perm(src,0,n-1);
		
		
	}
	
	private void perm(String src,int l,int r)
	{
		if(l==r)
		{
			StringBuffer str=new StringBuffer();
			str.append(src);
			System.out.println(str);
			
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				src=swap(src,l,i);
				perm(src,l+1,r);
				src=swap(src,l,i);
			}
		}
	}
	public static String swap(String a,int i,int j)
	{
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
		
	}
	
	
}
