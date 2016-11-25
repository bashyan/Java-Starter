import java.io.*;
import java.util.*;

public class WriteToFile {
    public static void main(String args[])
    {
        String text;
        try {
            Scanner s=new Scanner(System.in);
            text=s.nextLine();
            
            FileOutputStream fos=new FileOutputStream( "d:/mytest.txt");
            fos.write(text.getBytes());
            System.out.println("Contents written to the file");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");  
        }
        catch(IOException io)
        {
            System.out.println("Some problem");
        }
       
        // reading the file
      
        int i=0;
        try{
            FileInputStream fis=new FileInputStream("d:/hadoopjava/mytest.txt");
            while( (i= fis.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e)
        {
        
        }
        
    }
}
