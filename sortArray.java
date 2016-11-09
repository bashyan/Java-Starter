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
public static void main(String[] args) {
    int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            int tmp = 0;
            if (arr[i] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}