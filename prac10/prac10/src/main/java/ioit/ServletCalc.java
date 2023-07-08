package ioit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCalc extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	int i =Integer.parseInt(req.getParameter("num1"));
	int j =Integer.parseInt(req.getParameter("num2"));
	String operation = req.getParameter("operation");
	 
	int result = 0;
	    switch (operation) {
	      case "add":
	        result = i + j;
	        break;
	      case "subtract":
	        result = i - j;
	        break;
	      case "multiply":
	        result = i * j;
	        break;
	      case "divide":
	        result = i / j;
	        break;
	    }
		int k=i+j;
		
		//res.getWriter().println("result is :"+result);
		
		// Display the result
		PrintWriter out =res.getWriter();
	    out.println("<html>");
	    out.println("<head><title>Calculator Result</title></head>");
	    out.println("<body>");
	    out.println("result is :"+result);
	    out.println("</body>");
	    out.println("</html>");
		
		
	}
	
	
}
