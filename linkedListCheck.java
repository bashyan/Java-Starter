import java.util.*;
public class linkedListCheck
{
	public static void main(String qwe[])
	{
		LinkedList<String> lls = new LinkedList<String>();
		lls.add("a");
		lls.add("b");
		lls.add("c");
		lls.add("d");
		boolean check = lls.contains("f");
		if(check)
		{
			System.out.println("LinkedList contains the element");
		}
		else
		{
			System.out.println("LinkedList doesn't contains the element");
		}
	}	
}


