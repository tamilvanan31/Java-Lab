import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Feedback extends HttpServlet {
	static String[] employees = {"Ram", "Ravi", "Ragu", "Reena"};
	static int recordNo = 1;
	static String filename = "F:\\Temp\\feedback.txt";
	static File f = new File(filename);
	protected void showFeedbackForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try ( PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>User Feedback</title>");
			out.println("</head>");
			out.println("<body style = 'padding : 100px; font-size : 20px; font-family : Roboto;'>");
			out.println("<form method = 'post'>");
			out.println("<label>Enter your name : <input type = 'text' name = 'name' required></label><br><br>");
			out.println("<label>Choose Employee to give Feedback : <select name = 'EmpName'>");
			for(int i = 0; i < Feedback.employees.length; i++){
				out.println("<option value = '"+ i +"'>" + Feedback.employees[i] + "</option>");
			}
			out.println("</select></label>");
			out.println("<p>Rate your experience : </p>");
			for(int i = 1; i <= 5; i++){
				out.println("<input type = 'radio' name = 'stars' value = '" + i + "' required/><label for = '" + i + "'>");
				for(int j = 0; j < i ; j++)
					out.println("★");
					out.println("</label><br>");
			}
			out.println("<br><p>Any other suggestions : </p>");
			out.println("<input type = 'text' name = 'suggestions' height = '50' width = '50' />");
			out.println("<br><br><input type = 'submit' value = 'Submit Feedback' />");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		showFeedbackForm(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String name = request.getParameter("name");
		String EmpName = request.getParameter("EmpName");
		String stars = request.getParameter("stars");
		String suggestions = request.getParameter("suggestions");
		FileWriter fout = new FileWriter(f, true);
		fout.write("[ RECORD : " + recordNo + " ]\n");
		fout.write("Name : " + name + "\n");
		fout.write("Employee Name : " + EmpName + "\n");
		fout.write("Stars : " + stars + "\n");
		fout.write("Further Suggestions : " + suggestions + "\n");
		recordNo++;
		fout.close();
		PrintWriter out = response.getWriter();
		out.print("<h1>THANK YOU for your feedback " + name +" !</h1>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		processRequest(request, response);
	}
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
