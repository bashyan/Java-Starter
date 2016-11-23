import java.util.LinkedList;
public class linkedListRemoveFirst
{
	public static void main(String qwe[])
	{
		LinkedList<String> lls = new LinkedList<String>();
		lls.add("a");
		lls.add("b");
		lls.add("c");
		lls.add("d");
		lls.add("e");
		lls.add("f");
		lls.add("g");
		System.out.println("LinkedList "+lls);
		Object removeE = lls.removeFirst();
		System.out.println("Remove First Element "+removeE+" LinkedList "+lls);
		removeE = lls.removeLast();
		System.out.println("Remove Last Element "+removeE+" LinkedList "+lls);		
	}	
}


