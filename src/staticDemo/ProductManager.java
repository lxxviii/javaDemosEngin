package staticDemo;

public class ProductManager {
	int birsey=5;
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi...");
		} else {
			System.out.println("Ürün Bilgisi Geçersizdir");
		}
	}
}
