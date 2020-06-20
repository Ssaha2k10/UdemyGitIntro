package Functions;

public class BankAccount {

	public static void main(String[] args) {
	
		
		Bank bk=new Bank();
		Bank bk1=new Bank("Savings Account");
		bk.deposit(1000);
		bk1.setName("Mayo Chen");
		System.out.println(bk1.getName());
		System.out.println("Routing Number: "+ bk1.getRoutingnumber());
		bk1.accountNumber="4566790";
		System.out.println("Account Number:" + bk1.accountNumber);
		//System.out.println("Routing NUmber:" + bk1.routingnumber);
		

	}

}
