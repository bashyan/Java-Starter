import java.util.*;
public class duplicate
{
	public static void main(String[] args)
	{
		
		 
 		char[] charac={'A','t','B','A','C','T','C','B'};		 
		
		int c = charac.length;
		System.out.println("Length is "+c);
		for(int i=0;i<c;i++)
		{
		for(int j=i+1;j<c;j++)
		{
		if(charac[i]==charac[j])
		{
		System.out.println("Duplicate element is "+charac[i]);		
		}
		}
		}
		
	}
}
		 
