public class exceptionHandling
{
	static void handling()
		{
		int a = 3;
		int b = 0;
		try
			{
			b = a/b;
			}
		catch (ArithmeticException e)
			{
			System.out.println(b);
			}
		finally
			{
			System.out.println("error");
			}
		System.out.println("end");
		}

	static void array()
		{
		String a1[] = {"a","b","c","d","e","f"};
		for(int i = 0; i<a1.length+1;i++)
			{
			System.out.print(a1);
			}
		}
	public static void main(String str[])
		{
		byte b = 1;
 		   Byte bObj1 = new Byte(b);
   
    /*
    2. Create Byte object from String. Please note that this method can
    throw NumberFormatException if string doesnt contain parsable number.
    */	
		
   		//print value of Byte objects
    		System.out.println(bObj1);

		handling();
		array();
		}
}