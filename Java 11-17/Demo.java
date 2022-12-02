import java.sql.*;  
public class Demo{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/students","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
				System.out.println(rs.getString(40)+"  "+rs.getInt(3));  
			con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}  
}  