
import java.io.FileWriter;
import java.io.IOException;


public class FileWriteServlet 
{
    public class FileWriteServlet extends ServletBas
{  
    
    public void FileWrite() throws IOException
    {
        FileWriter fs = new FileWriter("E:\\Bashyan\\servlet.txt");
        BufferWriter bw = new BufferWriter(fs);
        
    }
}
    
}
