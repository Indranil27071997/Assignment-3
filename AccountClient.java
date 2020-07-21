package assignmentThree;

public class AccountClient {

	public static void main(String[] args) {
		
		Account employee1 = new Account("Active", 5000.0, 2500);
		employee1.depositAmount();
		
		Account employee2 = new Account("Inactive", 10000.0, 900);
		employee2.depositAmount();
		
		Account employee3 = new Account("active", 15000.0, 9500);
		employee3.depositAmount();
		
		

	}

}
