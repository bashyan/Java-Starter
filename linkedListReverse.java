import java.util.*;
public class linkedListReverse
{
	public static void main(String qwe[])
	{
		LinkedList<String> lls = new LinkedList<String>();

		lls.add("a");
		lls.add("b");
		lls.add("c");
		lls.add("d");

		ListIterator<String> lit = lls.listIterator(lls.size());
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}			
	}	
}


