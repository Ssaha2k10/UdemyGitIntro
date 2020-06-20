package Functions;

public class StudentDBApp {

	public static void main(String[] args) {
		StudentDB s1=new StudentDB("John", "45643278");
		s1.setdetails("374757970", "Worthing", "West Sussex");
		s1.getdetails();
		s1.showCourse("Journalism");
		s1.pay(1000);
		System.out.println(s1.toString());
		
		}

}

class StudentDB{
	
	private static int ID= 1000;
	private String name;
	private String SSN;
	private String emailID;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private double balance=2000.0;
	private double amount;
	private String course;
	//setting constructor to accept name and SSN//
	
	StudentDB(String name, String SSN){
		this.name=name;
		this.SSN=SSN;
		System.out.println();
		System.out.println("New User Created");
		ID++;
		//System.out.println("ID:" +ID);
		createuserID();
		email();
	}
	
	public void email() {
		emailID= name+ "@sdb.com";
		//System.out.println("Email ID : " + emailID);
	}
	
	public void createuserID() {
		int max=9000;
		int min=1000;
		int random= (int) (Math.random()* (max-min));
		this.userID= ID +"" + random + SSN.substring(4, 8);         
		//System.out.println("User ID: " + userID);
	}
	
	public void setdetails(String phone,String city, String state ) {
		this.phone=phone;
		this.city=city;
		this.state=state;
		
	}
	
	public void getdetails() {
		//System.out.println("Phone: "+ phone);
		//System.out.println("City: "+ city);
		//System.out.println("State: "+ state);
	}

	public void enroll() {
		//System.out.println("You are enrolled in the program:"+ course);
		
	}
	
	public void pay(double amount) {
		
		this.amount=amount;
		//System.out.println("Amount paid: "+ amount);
		checkbalance();
	}
	
	
	public void checkbalance() {
		//System.out.println("Initial Balance: "+ balance);
		balance=balance-amount;
		//System.out.println("Updated Balance: " + balance);
	}
	@Override
	public String toString() {
		
		return "[UserID: " + userID + "]"+ "\n[Name: " + name +"]"+"\n[SSN: " +SSN + "]"+"\n[EmailID : " + emailID+ "]" + "\n[Phone Number: " + phone + "]" + "\n[City: " + city + "]" + "\n[State: "+ state+ "]"+"\n[Course Enrolled: " + course +"]"+ "\n[Amount to be paid for course : "+ amount+ "]" + "\n[Updated Balance: " + balance + "]" ;
				
	}
	
	public void showCourse(String course) {
		
		this.course=course;
		//System.out.println("Course Enrolled: " + course);
		enroll();
	}

	
}


