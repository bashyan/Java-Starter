import java.io.*;
public class ObjectSerialization implements Serializable
{
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        ObjectSerialization obs = new ObjectSerialization();
        int num;
        String s;
        num= 1;
        s = "Number";
        System.out.println(" Write "+num+" "+s);
        FileOutputStream fos = new FileOutputStream("E:\\Bashyan\\Serialize.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obs);
        oos.flush();
        
        FileInputStream fis = new FileInputStream("E:\\Bashyan\\Serialize.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ObjectSerialization obis = new ObjectSerialization();
        obis = (ObjectSerialization)ois.readObject();
        System.out.println(obs.toString());
        ois.close();
    }
    
}
