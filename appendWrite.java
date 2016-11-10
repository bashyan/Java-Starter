
import java.io.*;
public class appendWrite
{
	public static void main(String[] a)
	{
		try
		{
			String data = "This is additional data";
			File fobj = new File("E:\\Bashyan\\New Text Document.txt");
			if(!fobj.exists())
			{
				fobj.createNewFile();
			}
			FileWriter fw = new FileWriter(fobj.getName(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			System.out.println("Written");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
}