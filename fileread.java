import java.io.*;
public class fileread
{
	public static void main(String a[])
	{
	try 
	{
	FileReader fileobj = new FileReader("C:\\Users\\Bashyan PC\\Documents\\GitHub\\Java-Starter\\Exception Handling Nov 8.txt");
	BufferedReader reader = new BufferedReader(fileobj);
	String str;
	while((str = reader.readLine())!=null)
	{
	System.out.println(str);
	} }
	catch (Exception e)
	{
	System.out.println(e);} 
	
	/*//try 
	//{
	File fileobj1 = null;
	BufferedWriter writer = null;
	fileobj1 = new File("C:\\Users\\Bashyan PC\\Documents\\GitHub\\Java-Starter\\Exception Handling Nov 10.txt");
	//writer = new BufferedWriter(new FileWriter(fileobj1));
	String str1 = "Hi";
	
		writer = new BufferedWriter(new FileWriter(fileobj1));
	System.out.println("written");
	//} 
	//catch (Exception e)
	//{
	//System.out.println(e);}*/
	}
}
	
	