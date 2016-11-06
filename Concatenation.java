import java.util.Scanner;
class Concatenation
{
    public static void main(String []args)
    {
        Scanner br=new Scanner(System.in);
        int i=0;
        String s1,s2;
        System.out.print("Enter the first string:");
        s1=br.read();
        System.out.print("Enter the Second string:");
        s2=br.read();
        char s3[]=new char[s1.length()+s2.length()];
        for(;i<s1.length();i++)
            s3[i]=s1.charAt(i);
        for(int j=0;j<s2.length();j++)
            s3[i++]=s2.charAt(j);
        System.out.println("Result:"+new String(s3));
    }
}