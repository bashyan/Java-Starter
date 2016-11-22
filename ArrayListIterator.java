import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println("Enter 5 data to arraylist");
		Scanner ab = new Scanner(System.in);
		int a;
		for (int i=0;i<5;i++)
		{
			a = ab.nextInt();
			num.add(a);
		}		
		Iterator getele = num.iterator();
		System.out.println("ArrayList Elements using IteratorInterface");
		while(getele.hasNext())
		{
			Object display = getele.next();
			System.out.println(display);
		}
	}

}
