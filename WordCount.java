import java.util.*;
public class WordCount {
public static void main(String args[])
{
int count=0;
System.out.println("Enter the String: ");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
for(char i='a';i<='z';i++)
{
for(int j=0;j<str.length()-1;j++)
{
if(str.charAt(j)==i){
count++;
}
}
if(count!=0){
System.out.println(i+"="+count);
count=0;
}
}
}
}