import java.util.Scanner;
public class strlength 
{
    public static void main(String[] args)
    {
        int i=0,length=0;
		System.out.println("Enter the string");
		Scanner st = new Scanner(System.in);
		String str = st.next();
        char[] charry = str.toCharArray();
		try
		{
			while(charry[i]!='\0')
			{
            length++;
			i++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Length of the array is "+length);			
		}
		
        
        
        
    }
}
