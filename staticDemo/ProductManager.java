package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("EKlendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}
