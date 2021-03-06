import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class StudentServletFileRead 
{
    public static void main(String qwe[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\Bashyan PC\\Documents\\NetBeansProjects\\StudentDemoServletFile\\StudentServletDemo.txt");
        BufferedReader br = new BufferedReader(fr);
        String allLines = null, firstToken = null;        
        String semiToken[] = new String[4];
        String finalToken[] = new String[4];
        int i=0,j=0;        
        while((allLines = br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(allLines,"//");
            while(st.hasMoreTokens())
            {
                firstToken = st.nextToken();
                System.out.println(firstToken);
                if(firstToken.contains("%"))
                {
                semiToken[j] = firstToken;
                j++;
                }
            }
        }        
        br.close();
        for(String T: semiToken)
        {
            String stringIndex = T;
            finalToken[i] = T.substring((stringIndex.length()-3),(stringIndex.length()-1));
            System.out.println("\nPercentages of Students "+finalToken[i]);
            i++;
        }
        int intPer[] = new int[4];
        int pass=0, fail=0;
        for(int p=0; p<4; p++)
        {           
            intPer[p] = Integer.parseInt(finalToken[p]);
            if(intPer[p]<50)
            {
                fail++;
            }
            else
            {
                pass++;
            }
        }
        System.out.println("\nTotal Students Passed is "+pass+"\nTotal Students Failed is "+fail);
    }
}
