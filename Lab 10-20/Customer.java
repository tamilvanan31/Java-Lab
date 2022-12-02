import java.io.Serializable;
class Customer implements Serializable{
	int accno;
	String name;
	transient int balance;
	public Customer(String name, int accno, int balance){
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
}