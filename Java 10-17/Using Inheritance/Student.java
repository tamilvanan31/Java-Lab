import java.io.Serializable;
class Person implements Serializable{
	int id;
	String name;
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}
public class Student extends Person{
	int fee;
	String course;
	public Student(int id, int fee, String course, String name){
		super(id, name);
		this.fee = fee;
		this.course = course;
	}
}