package assignmentThree;

public class GiftCardTest {

	public static void main(String[] args) {
		
		GiftCard obj1 =new GiftCard(9087,0.0, true);
		obj1.rechargeCard(2000.0);
		
		obj1.swipeCard(400.0);
		
		obj1.swipeCard(500.0);
		
		
		GiftCard obj2 =new GiftCard();
		obj2.setActive(true);
		obj2.rechargeCard(3000.0);
		obj2.swipeCard(500.0);
		obj2.swipeCard(2600.0);
		System.out.println(obj2.getBalence());
		

	}

}
