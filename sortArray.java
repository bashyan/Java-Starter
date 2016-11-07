class sortArray
{
public static void main(String[] args)
{
	int[] num={5,4,3,2,1};
	int[] num1 = new int[num.length];
	for(int A : num)
	System.out.println(A);
	System.out.println("\n");
	int a = num[0];
	for(int i=1,j=0;i<num.length;i++,j++)
	{
		if(num[0]<num[i])
		{
			num[j] = num[0];
			
		}		
		System.out.println(num1[j]);
		
	}	
}
}