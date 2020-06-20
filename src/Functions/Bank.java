package Functions;

public class Bank {
	
	
	private String name;
	String accountNumber;
	double balance=0;
	private static final String routingnumber= "567889";
	
	Bank(){
		System.out.println("Account Created");
	}
	
	Bank(String accountType){
		System.out.println("Account Type: "+ accountType);
	}
	
	
	void deposit(double deposit) {
		
		System.out.println("Amount deposited:"+deposit );
		balance= balance+deposit;
		System.out.println("Updated Balance:" + balance);
		
	}
	
	public void setName(String name) {
		
		this.name= "Ms." +  name;
	}
	
	public String getName() {
		return name;
		
	}
	

	public static String getRoutingnumber() {
		return routingnumber;
	}

	void checkbalance() {
		
	}
	
	void withdraw() {
		
	}
}
