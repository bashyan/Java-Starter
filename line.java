import java.util.*;
import java.io.*;
public class line
{
	public static void main(String[] args) throws Exception
	{
		//File Write 10 lines
		FileWriter fobj = new FileWriter("A:\\lines.txt");
		BufferedWriter buffer = new BufferedWriter(fobj);
		System.out.println("Enter 10 lines one by one");
		Scanner ab = new Scanner(System.in);
		String[] line = new String[10];
		for(int i=0;i<10;i++)
		{
			line[i] = ab.nextLine();
			buffer.write(line[i]);
			buffer.newLine();			
		}
		buffer.close();
		
		//File Read all lines
		FileReader fobjr = new FileReader("A:\\lines.txt");
		BufferedReader bufferr = new BufferedReader(fobjr);
		String s = null;
		int i = 0;
		String str[] = new String[10];
		while((s = bufferr.readLine())!=null)
		{
			//s = bufferr.readLine();			
			str[i] = s;			
			i++;			
		}
		
		// read 3rd and 4th line
		int k=3;
		for(int j = 0;j<2;j++)
		{
			System.out.println("\nLine "+k+" is "+str[k-1]);
			k++;
		}
	}
