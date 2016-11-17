import java.io.*;
import java.util.*;
public class FileCustReader1
{
	public static void main(String gr[]) throws Exception
	{		
		// Write Customer details to .txt file
		
		FileWriter filew = new FileWriter("A:\\FileWriter.txt");
		BufferedWriter bufferw = new BufferedWriter(filew);
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter number of customer details to be stored");
		int count = ab.nextInt();
		String s1[][] = new String[count][4];		
		for(int i=0; i<count; i++)
		{
			System.out.println("Enter customer #"+(i+1)+" ID, Name, Age, Salary");		
			for(int j=0;j<4;j++)
			{
				s1[i][j] = ab.next();
				bufferw.write(s1[i][j]+",");
			}
			bufferw.write("/");
			bufferw.newLine();
			
		}
		bufferw.close();
		
		//Display the written file in screen
		System.out.println("C_ID"+"\t"+"Name"+"\t"+"Age"+"\t"+"Salary");		
		for(int i=0; i<count; i++)
		{						
			for(int j=0;j<4;j++)
			{				
				System.out.print(s1[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("File Written");
		
		
		// Read .txt file
		
		FileReader filer = new FileReader("A:\\FileWriter.txt");
		BufferedReader bufferr = new BufferedReader(filer);
		String s;int i=0;
		String[] str = new String[count];
		
		System.out.println("File Read");
		while((s = bufferr.readLine())!=null)
		{
			System.out.println(s);
			str[i] = s;
			i++;
			System.out.println("Array1 str"+str[i]);
			
		}
		for(int v=0;v<count;v++)
		{
			System.out.println("Array str"+str[i]);
		}
		
		
				
		filer.close();
		System.out.println("End");
	}
}
