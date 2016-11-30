import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/StuServletDemo"})
public class StuServletDemo extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {        
    
        PrintWriter printDetails = response.getWriter();
        response.setContentType("text/html");
        
        String StuID = request.getParameter("StuID");
	if(StuID.charAt(0)!='s' || StuID.length()!=4)
	{
		System.out.println("Invalid Student ID");
	}
	String StuName = request.getParameter("StuName");
	if(StuName.length()>30)
	{
		System.out.println("Name greater than 30 characters");
	}
	String StuAge = request.getParameter("StuAge");
	int sAge = Integer.parseInt(StuAge);
	if(sAge>25)
	{
		System.out.println("Age not eligible");
	}
	String StuMark = request.getParameter("StuMark");
	int sMark = Integer.parseInt(StuMark);
	if(sMark<0)
	{
		System.out.println("Mark cannot be negative");
	}
	String StuPer = request.getParameter("Stu%");
	float StuPerc = Float.parseFloat(StuPer);
	String StuGrade = request.getParameter("StuGrade");
	if(StuGrade!= "A" || StuGrade!= "B" || StuGrade!= "C" || StuGrade!= "D" || StuGrade!= "E")
	{
		System.out.println("Invalid Grade");
	}
	

	  String s[] = new String[6];  
          String s1[] = new String[6];  
          s[0] = "Student ID \t: ";  
          s[1] = "Student Name \t: ";  
          s[2] = "Student Age \t: ";      
          s[3] = "Student Mark : ";  
          s[4] = "Student % \t: ";  
          s[5] = "Student Grade \t: ";  
          s1[0] = String.valueOf(StuID);  
          s1[1] = StuName;  
          s1[2] = StuAge;  
          s1[3] = String.valueOf(StuMark);  
          s1[4] = String.valueOf(StuPer);  
          s1[5] = StuGrade; 

	
	FileWriter fout = new FileWriter("E:\\Nebw faoslhdyearn\\StudentSverDemo.txt", true);  
        try  
        {
	BufferedWriter bw = new BufferedWriter(fout);  
        for(int i=0; i<6; i++)  
        {
	      bw.write(s[i]+s1[i]+",");  
              bw.newLine();  
        }
	bw.write("-");
        }
	catch(Exception ex)
	{
	ex.printStackTrace();
	}
        
        printDetails.println("<h1>Student Retreived Data</h1>");
        printDetails.println("<br/>");
        printDetails.println("\tStudent ID : "+StuID);
        printDetails.println("<br/>");
        printDetails.println("Student Name \t: "+StuName);
        printDetails.println("<br/>");
        printDetails.println("Student Age \t: "+StuAge);
        printDetails.println("<br/>");
        printDetails.println("Student Mark \t: "+StuMark);
        printDetails.println("<br/>");
        printDetails.println("Student Percentage \t: "+StuPer);
        printDetails.println("<br/>");
        printDetails.println("Student Grade \t: "+StuGrade);
        printDetails.println("<br/>");
        
                
        printDetails.println("<hr/>Student Modified Data<hr/>");
        printDetails.println("<br/>");
        printDetails.println(s[0]+StuID);
        printDetails.println("<br/>");
        printDetails.println(s[1]+StuName);
        printDetails.println("<br/>");
        printDetails.println(s[2]+StuAge);
        printDetails.println("<br/>");
        printDetails.println(s[3]+StuMark);
        printDetails.println("<br/>");
        printDetails.println(s[4]+StuPer);
        printDetails.println("<br/>");
        printDetails.println(s[5]+StuGrade);
        printDetails.println("<br/>");        
    }
}
