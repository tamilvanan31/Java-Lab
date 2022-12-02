import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerInfo extends HttpServlet{
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   PrintWriter out = response.getWriter();
   out.println("The server name is " + request.getServerName() + "<br>");
   out.println("The server port number is " + request.getServerPort()+ "<br>");
   out.println("The protocol is " + request.getProtocol()+ "<br>");
   out.println("The scheme used is " + request.getScheme());
  }
}