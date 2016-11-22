import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListSecondLargest {

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
		System.out.println("ArrayList Elements"+num);
		Collections.sort(num);
		System.out.println("Second Largest Elements is "+num.get(num.size()-2));
	}

}
