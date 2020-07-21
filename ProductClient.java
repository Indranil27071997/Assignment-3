package assignmentThree;

public class ProductClient {

	public static void main(String[] args) {
		
		Product obj1=new Product("Laptop",45000.00,'E');
		Product obj2=new Product("Trimmer",8900.0, 'T');
		
		System.out.println(" Product Code : "+obj1.getProductCode());
		System.out.println(" Name : "+obj1.getProductName());
		System.out.println(" Price : "+obj1.getProductPrice());
		System.out.println(" Category : "+obj1.getCategoryCode());
		
		System.out.println(" Product Code : "+obj2.getProductCode());
		System.out.println(" Name : "+obj2.getProductName());
		System.out.println(" Price : "+obj2.getProductPrice());
		System.out.println(" Category : "+obj2.getCategoryCode());
		
		

}
}
