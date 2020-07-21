package assignmentThree;

public class AccountTest1Client {

	public static void main(String[] args) {
		
		AccountTest1 icici = new AccountTest1("Deposit", 29800.0, 0.0, 198000);
		icici.displayAmount();
		
		AccountTest1 hdfc = new AccountTest1("Withdrawl", 0.0, 70000.0, 198000);
		hdfc.displayAmount();
		
		AccountTest1 sbi = new AccountTest1("Deposit and Withdrawl", 29800.0, 89000.0, 878000);
		sbi.displayAmount();
		
		AccountTest1 ubi = new AccountTest1("Withdrawl", 0.0, 290000.0, 198000);
		ubi.displayAmount();

	}

}
