import java.io.*;
public class fileread
{
	public static void main(String a[])
	{
	try 
	{
	File fileobj = null;
	BufferedReader reader = null;
	fileobj = new File("E:\\Bashyan\\Exception Handling Nov 9.txt");
	reader = new BufferedReader(new FileReader(fileobj));
	String str;
	while((str = reader.readLine())!=null)
	{
	System.out.println(str);
	} }
	catch (Exception e)
	{
	System.out.println(e);}
	}
}
	
	