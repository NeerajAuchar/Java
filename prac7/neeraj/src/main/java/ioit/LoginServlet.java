package ioit;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uid="aissms";
		String upwd="ioit";
		String id=req.getParameter("id");
		String pwd =req.getParameter("pwd");
		
			if (id.equals(uid) && pwd.equals(upwd)) {
				System.out.println(" ID :"+id+"\n PASSWORD:"+pwd);
				String str="Login Successfull";
				System.out.println(" Server side message :"+str);
				res.getWriter().println("Client Side Message :"+str);
			}
			else {
				String str="Login FAILED";
				System.out.println(" ID :"+id+"\n PASSWORD:"+pwd);
				System.out.println(" Server side message :"+str);
				res.getWriter().println("Client Side Message :"+str);
			}
		}
}
