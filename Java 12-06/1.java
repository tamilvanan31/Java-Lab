import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class protocolName extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
		try ( PrintWriter out = response.getWriter()) {
			Date nowDate = new Date();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Display Information</title>");
			out.println("</head>");
			out.println("<body style = 'font-family : Roboto; font-size : 20px;'>");
			out.println("<p>Protocol Name : <span style = 'color : blue'>" + request.getScheme() + "</span></p>");
			out.println("<p>Current Date and Time : <span style = 'color : blue'>" + nowDate.toString() + "</span></p>");
			out.println("<p>Client Info : <span style = 'color : blue'>" + request.getHeader("User-Agent") + "</span></p>");
			out.println("<p>Server Info : <span style = 'color : blue'>" + getServletContext().getServerInfo() + "</span></p>");
			out.println("</body>");
			out.println("</html>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
