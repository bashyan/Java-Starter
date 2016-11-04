import java.util.Scanner;
public class Pattern
{
	public static void main(String[] args)
	{
		int i,j,nl;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter no of line");
		nl = sobj.nextInt();
		for(i=0;i<nl;i++)
		{
			for(j=0;j<i;j++)
			{  //print spaces
				System.out.print(" ");
			}
			for(j=0;j<nl-i;j++)
			{
				// print left side value
				char c = (char) ('A' +j);
				System.out.print(c);
			}
			for(j=nl-i-2;j>=0;j--)
			{
				// print right side value
				char c = (char) ('A' +j);
				System.out.print(c);
			}
			System.out.println(" ");s
		}
	}
}


String str = {""};
char charname = s.charAt(i);

