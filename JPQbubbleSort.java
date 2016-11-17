import java.util.Scanner;
public class JPQbubbleSort
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i] = ab.nextInt();
			b[i] = a[i];
		}
		
		int largest=a[0], smallest=a[0];
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[j] = a[i];
				}
			}				
		}
		for(int Q: a)
		System.out.println(Q);
	}
}