
import java.io.BufferedReader;
import java.io.FileReader;


public class StudentServletFileRead 
{
    try
    {
        FileReader fr = new FileReader("E:\\Nebw faoslhdyearn\\StudentServletDemo.txt");
        BufferedReader br = new BufferedReader(fr);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
    
}
