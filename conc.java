public class conc
{
	public static void main(String[] args)
	{
		String a1 = "GITABASHYAN";
		char a[] = a1.toCharArray();
		String b1 = "RAMAMOORTHY";
		char b[] = b1.toCharArray();
		int i=0, j=0;
	    while(a[i]!='\0')
		{
			i++;
		}
		while(b[j]!='\0')
		{
			a[i]=b[j];
			i++;
			j++;
		}	
		System.out.println(a);
	}
}	
