import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/ServletBas"})
public class ServletBas extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
        PrintWriter printDetails = response.getWriter();
        response.setContentType("text/html");
        
        String ID = request.getParameter("EmpID");
        String Name = request.getParameter("EmpName");
        String Age = request.getParameter("EmpAge");
        String Salary = request.getParameter("EmpSalary");
        String Email = request.getParameter("EmpEmail");
        String Citizen = request.getParameter("EmpCitizen");
        
        printDetails.println("<h1>Employee Retreived Data</h1>");
        printDetails.println("<br/>");
        printDetails.println("\tEmployee ID : "+ID);
        printDetails.println("<br/>");
        printDetails.println("Employee Name \t: "+Name);
        printDetails.println("<br/>");
        printDetails.println("Employee Age \t: "+Age);
        printDetails.println("<br/>");
        printDetails.println("Employee Salary \t: "+Salary);
        printDetails.println("<br/>");
        printDetails.println("Employee Email \t: "+Email);
        printDetails.println("<br/>");
        printDetails.println("Employee Citizen \t: "+Citizen);
        printDetails.println("<br/>");
        
        int eAge = Integer.parseInt(Age);
        float eSalary = Float.parseFloat(Salary);
        if(eAge>30)
        {
            eSalary += 3500;
            printDetails.println("<br/>");
            printDetails.println("Employee Medical Aid is added, and the new Salary is "+eSalary);
        }
        Citizen = Citizen.toUpperCase();
        if(!Citizen.equals("INDIAN"))
        {
            eSalary *= (0.9f);
        }
        if(!Email.contains("niit.com"))
        {
           Email = "Invalid EMail ID";
        }
        
        printDetails.println("<hr/>Employee Modified Data<hr/>");
        printDetails.println("<br/>");
        printDetails.println("\tEmployee ID : "+ID);
        printDetails.println("<br/>");
        printDetails.println("Employee Name \t: "+Name);
        printDetails.println("<br/>");
        printDetails.println("Employee Age \t: "+Age);
        printDetails.println("<br/>");
        printDetails.println("Employee Salary \t: "+eSalary);
        printDetails.println("<br/>");
        printDetails.println("Employee Email \t: "+Email);
        printDetails.println("<br/>");
        printDetails.println("Employee Citizen \t: "+Citizen);
        printDetails.println("<br/>");
        
    }
}

