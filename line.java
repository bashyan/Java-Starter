import java.util.*;
import java.io.*;
public class line
{
	public static void main(String[] args) throws Exception
	{
		//File Write 10 lines
		FileWriter fobj = new FileWriter("A:\\lines.txt");
		BufferedWriter buffer = new BufferedWriter(fobj);
		System.out.println("Enter line");
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
		String s = "";
		int i = 0;
		String str[] = new String[10];
		while((s = bufferr.readLine())!=null)
		{
			//s = bufferr.readLine();
			System.out.println("1+ "+s);
			str[i] = s;
			System.out.println("2+ "+str[i]);
			i++;
			
		}
		
		// read 3rd and 4th line
		int k=2;
		for(int j = 0;j<2;j++)
		{
			System.out.println(str[k]);
			k++;
		}
	}
}