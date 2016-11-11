<<<<<<< HEAD
import java.io.*;
import java.util.*;
import java.lang.*;
public class FileCustReader1
{
	public static void main(String g[]) throws Exception
	{		
		// Write Customer details to .txt file
		
		FileWriter filew = new FileWriter("A:\\FileWriter.txt");
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
				filew.write(s1[i][j]+"/");
				
			}	filew.write(",");		
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
		
		FileReader filer = new FileReader("A:\\FileWriter.txt");
		BufferedReader buffer = new BufferedReader(filer);
		String s;int i=0;
		String[] str = new String[count*4];
		
		System.out.println("File Read");
		while((s = buffer.readLine())!=null)
		{
			str[i] = s;
			i++;
								
		}
		for(int v=0;v<count*4;v++)
		{
			System.out.println("Array str"+str[i]);
		}
		
		
				
		filer.close();
		System.out.println("End");
	}
}
=======
import java.io.*;
import java.util.*;
import java.lang.*;
public class FileCustReader
{
	public static void main(String g[]) throws Exception
	{		
		// Write Customer details to .txt file
		
		FileWriter filew = new FileWriter("A:\\FileWriter.txt");
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
				filew.write(s1[i][j]+"/");
			}	filew.write(",");		
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
		
		FileReader filer = new FileReader("A:\\FileWriter.txt");
		BufferedReader buffer = new BufferedReader(filer);
		String s;int i=0;
		String[] codes = new String[count*4];
		List<String> str = new ArrayList<>();
		System.out.println("File Read");
		while((s = buffer.readLine())!=null)
		{
			codes[i] = buffer.read();
			i++;
			System.out.println("Buffer"+s);					
			//str.add(s);					
		}
		System.out.println("Array str"+str);
		
		//String[] arr = str.toArray(new String[0]);
		
		 
		 /*for (String strLine : arr) 
			{
                String[] strWord = strLine.split("/");
                for (String sew : arr) 
				{
                    System.out.println(strWord);
					
                }
				
            //}
			

        }
		for(int i=0;i<arr.length;i++)
		{
			String[] split1 = arr[i].split(",");
		}*/
		
		
			
		
			
		
		
							
					
				
		filer.close();
		System.out.println("End");
	}
}
>>>>>>> b639260e512578ab0558b6f8ae0996f574ab2e54
