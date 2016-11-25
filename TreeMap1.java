import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap1 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1546, "A");
        tm.put(2346, "B");
        tm.put(3476, "F");
        tm.put(3247, "C");
        tm.put(4346, "D");
        tm.put(5123, "E");
        System.out.println("TreeMap");
        for(Map.Entry M : tm.entrySet())
        {
            System.out.println(M+" "+tm.containsKey(3476));
        }
        tm.remove(3476);
        for(Map.Entry R : tm.entrySet())
        {
            System.out.println(R+"  "+tm.get(5123)+" "+tm.containsKey(3476));
        }
        
        
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1546", "A");
        hm.put("2346", "B");
        hm.put("3476", "F");
        hm.put("3247", "C");
        hm.put("4346", "D");
        hm.put("5123", "E");
        System.out.println("HashMap");
        for(Map.Entry M : hm.entrySet())
        {
            System.out.println(M);
        }
        for(String K : hm.keySet())
        {
            System.out.println(K);
        }
    }
}
