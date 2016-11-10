import java.io.*;
import java.util.*;
public class FileCustReader
{
	public static void main(String g[]) throws Exception
	{
		
		
		// Write Customer details to .txt file
		
		FileWriter filew = new FileWriter("E:\\FileWriter.txt");
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
			}			
		}
		
		for(String[] A : s1)
		{ 
			for(String B : A)
			{
				filew.write(B);
				filew.write("/");
			}filew.write(",");
		}
		
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
		filew.close();
		// Read .txt file
		
				FileReader filer = new FileReader("E:\\FileWriter.txt");
				BufferedReader buffer = new BufferedReader(filer);
				String s;
				String st[][] = new String[count][4] ;
				System.out.println("File Read");
				while((s = buffer.readLine())!=null)
				{System.out.println(s);
					String [] arr = s.split(",");
					for (String W: arr)
						{
							System.out.println(W);
							for(int i=0;i<count;i++) 
							{ 	
								for(int j=0;j<4;j++)
								{
									st[i][j] = W;
								}
							}
						}
					
				}
				System.out.println("2D String");
				for(int i=0;i<count;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.println(st[i][j]);
					}
				}
				
				filer.close();
	}
}
