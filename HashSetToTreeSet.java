import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet 
{
	public static void main(String[] args) 
	{
		Set<String> hset = new HashSet<>();
		hset.add("Dell");
		hset.add("Toshiba");
		hset.add("Apple");
		hset.add("Google");
		hset.add("Lenovo");		
		System.out.println("Set: "+ hset);		
		Set<String> tset = new TreeSet<>(hset);
		System.out.println("TreeSet:"+tset);		
	}
}