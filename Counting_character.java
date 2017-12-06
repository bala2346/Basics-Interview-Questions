package cracking_the_code_interview;
import java.util.*;
public class Counting_character {

	public static void main(String[] args)
	{
	 String name="aaaaaccccdddd";
	 String ComperessedString="";
	 int count=0;
	 for(int i=0;i<name.length();i++)
	 {
		 count++;
		 if(i+1>=name.length() || name.charAt(i)!=name.charAt(i+1))
		 {
			 ComperessedString+=""+count+name.charAt(i);
			 count=0;
		 }
	 }
	 System.out.println(ComperessedString.length()<name.length()?ComperessedString.toString():name);
	}
}
