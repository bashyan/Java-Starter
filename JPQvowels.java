import java.util.Scanner;
public class JPQvowels
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		char[] ch = str.toCharArray();
		char cha;
		int x=0, u=0;		
		for(int i=0;i<ch.length;i++)
		{
			int y=0;
			if(ch[i] == 'a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u' || ch[i] == 'A' || ch[i] =='E' || ch[i] =='I' || ch[i] =='O' || ch[i] =='U')
			{
				x++;
				y++;
			}
			else
			{
				y--;
			}
			u = y;
			if(x!=u)
			{
				cha = ch[i-1];
				ch[i-1] = ch[i];
				ch[i] = cha;
			}
		}
		for(char W: ch)
		{
			System.out.println(W);
		}
		System.out.println("Number of vowels in the string is "+x+" by using if statement");
	}
}