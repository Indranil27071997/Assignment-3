package assignmentThree;

public class Account {
	String account;
	double primarybal;
	double deposit;
	
	public Account(String account,double primarybal, double deposit) {
		
		this.account= account;
		this.deposit= deposit;
		this.primarybal= primarybal;
	}
	public void depositAmount() {
		
		
		if(account == "Active" || account == "active") {
			
			double bal= deposit + primarybal;
			System.out.println("The witstanding account after deposit = "+ bal);
			System.out.println("Deposit successful");
		}
		else  {
			System.out.println("Deposit unsuccessful due to inactive account");
		}
		
		
	}

}
