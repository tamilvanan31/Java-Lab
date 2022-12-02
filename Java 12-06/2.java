import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
	static String[] username = {"Java", "java123"};
	static String[] password = {"passwrd", "123"};
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try ( PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Login</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
	protected void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	response.setContentType("text/HTML");
		try(PrintWriter out = response.getWriter()){
			out.write("<html>");
			out.write("<title>Login</title>");
			out.write("<body style = 'padding : 100px; font-size : 20px; font-family : Roboto;'>");
			out.write("<form method = 'post'>");
			out.write("<label>Username : <input type = 'text' name = 'username'/></label><br>");
			out.write("<label>Password : <input type = 'password' name = 'password'/></label><br>");
			out.write("<input type = 'submit' id = 'login' value = 'Login' />");
			out.write("</form>");
			out.write("</body>");
			out.write("</html>");
		}
	}
	protected void showOutput(HttpServletResponse response, boolean logged, int index) throws IOException, ServletException{
		try(PrintWriter out = response.getWriter()){
			LocalDate today = LocalDate.now();
			out.write("<html>");
			out.write("<body style = 'padding : 100px; font-size : 20px; font-family : Roboto;'>");
			if(logged)
				out.write("<p>Successfully Logged in! Welcome " + Login.username[index] + " Today's Date : " + today.toString() + "</p>");
			else
				out.write("<p>Login Unsuccessful! Please Reload and Login again!</p>");
				out.write("</body>");
				out.write("</html>");
		}
	}
	protected void LoginAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String uString = request.getParameter("username");
		String pString = request.getParameter("password");
		boolean found = false;
		int ans = -1;
		//Search our Database for username and password
		for(int i = 0;i < Login.username.length; i++){
		if(uString.equals(Login.username[i]) && pString.equals(Login.password[i])){
			found = true;
			ans = i;
			break;
			}
		}
		showOutput(response, found, ans);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		showLoginForm(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		LoginAuthentication(request, response);
	}
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
