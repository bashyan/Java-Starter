import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListReverse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> num = new ArrayList<String>();
		System.out.println("Enter 5 data to arraylist");
		Scanner ab = new Scanner(System.in);
		String a= "";
		for (int i=0;i<5;i++)
		{
			a = ab.nextLine();
			num.add(a);
		}
		System.out.println("ArrayList Elements"+num);
		Collections.reverse(num);
		System.out.println("ArrayList Reversed Elements"+num);
	}

}
