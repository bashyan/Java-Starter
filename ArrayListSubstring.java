import java.util.Scanner;
public class ArrayListSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 data to arraylist");
		Scanner ab = new Scanner(System.in);
		String a= "";
		for (int i=0;i<5;i++)
		{
			a = ab.nextLine();
		}
		System.out.println("String"+a);
		a = subString(3);
		

	}

}
