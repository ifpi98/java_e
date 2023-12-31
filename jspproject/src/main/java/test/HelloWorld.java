package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.java.javaURLContextFactory;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
        super();  
    }
        
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
    }
        
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
    	
    	response.setContentType("text/html;charset=utf-8");
    	
    	PrintWriter out = response.getWriter();
    	
    	out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
    	.append("<h2>HelloWorld world !!</h2><hr>")
    	.append("현재 날짜와 시간은: " + java.time.LocalDateTime.now())
    	.append("</body></html>");
    	
    	String uid = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String pw2 = request.getParameter("pw2");
    	String name = request.getParameter("name");
    	String comment = request.getParameter("comment");
    	String fruit = request.getParameter("fruit");
    	String[] fruit2 = request.getParameterValues("fruit2");
    	String it = request.getParameter("it");
    	
    	String res="<h3> User ID : " + uid + "</h3>";
    	res+="<h3> User PW : " + pw + "</h3>";
    	res+="<h3> User PW2 : " + pw2 + "</h3>";
    	res+="<h3> User Name : " + name + "</h3>";
    	res+="<h3> User Comment : " + comment + "</h3>";
    	res+="<h3> chosen fruit : " + fruit + "</h3>";
    	res+="<h4> chosen fruits : ";
    			for (int i=0; i<fruit2.length;i++) {
    				res+= fruit2[i]+ " "; 
    			}
    	res+=" </h4>";
    	res+="좋아하는 언어 : " + it;
    	
    	
    	response.getWriter().print(res);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
