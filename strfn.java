public class strfn
{
	public static void main(String[] args)
	{
		
		char a1[] = {'w','e','l','c','o','m','e',' ','t','o',' ','j','a','v','a'};
		String b1 = "";
		b1 = b1.copyValueOf(a1,8,7);
		System.out.println(b1);
		
		String a = "welcom to java";
		String b = a.substring(8,11);
		System.out.println(b);
		

		char b2[] = new char[15];
		a.getChars(3,7,b2,2);
		System.out.println(b2); 

		
		
		
	}
}