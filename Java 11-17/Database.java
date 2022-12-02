import java.sql.*;
public class Database{
	 static String DRIVER = "com.mysql.cj.jdbc.Driver";
	 static String DBMS_URL = "jdbc:mysql://localhost/university";
	 static String username = "root";
	 static String password = "root";
	 static Connection conn = null;
	 public static void main(String[] args) throws Exception{
		 Class.forName(DRIVER);
		 conn = DriverManager.getConnection(DBMS_URL, username, password);
		 float[] grades = Student.getMarks();
		 updateGrades(grades);
		 System.out.println("Grades Successfully Updated!");
	 }
	 public static void updateGrades(float[] grades) throws Exception{
		 for(int i = 0;i < grades.length; i++){
			 String query = "Update marksheet set grades = " + grades[i] + " where id = " + (i + 1);
			 Statement stmt = conn.createStatement();
			 stmt.executeUpdate(query);
		 }
	 }
}
class Student{
	 public static float[] getMarks() throws Exception{
		 float[] grades;
		 Statement stmt = Database.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		 String query = "Select * from marksheet";
		 ResultSet rs = stmt.executeQuery(query);
		 rs.last();
		 int size = rs.getRow();
		 rs.beforeFirst();
		 grades = new float[size];
		 int i = 0;
		 int k = 1;
		 while(rs.next()){
			 String name = rs.getString("name");
			 float English = rs.getFloat("english");
			 float Science = rs.getFloat("language");
			 float Maths = rs.getFloat("maths");
			 float grade = makeGrade(English, Science, Maths);
			 grades[i++] = grade;
			 System.out.println(k + "." + name + " - " + grade);
			 k++;
		 }
		 return grades;
		 }
		 public static float makeGrade(float x, float y, float z){
			 x /= 100;
			 y /= 100;
			 z /= 100;
			 return (x * 3 + y * 3 + z * 4);
	 }
}