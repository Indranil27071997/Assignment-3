package assignmentThree;

public class AccountTest1 {
	
	String transactiontype;
	double depositBalence;
	double withdrawBalence;
	double primaryBalence;
	
	public AccountTest1(String transactiontype, double depositBalence, double withdrawBalence, double primaryBalence) {
		this.transactiontype= transactiontype;
		this.depositBalence=depositBalence;
		this.withdrawBalence=withdrawBalence;
		this.primaryBalence= primaryBalence;
	}
	
	public void displayAmount() {
		
		double finalBalence= primaryBalence + depositBalence - withdrawBalence;
		
		if(withdrawBalence >(primaryBalence + depositBalence)) {
			System.out.println("Please enter valid numbers ");
			System.out.println("Try again please.");
			
		}
		else {
			System.out.println("The balence reamaining after successful "+transactiontype+" transaction is :"+ finalBalence);
		}
		
	}

}
