package staticDemo;

public class ProductValidator {
	
	static{
		System.out.println("Statik Yapıcı Blok Çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Blok Çalıştı");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void birsey() {
		
	}
	
	public static class BaskaBirSey{
		public static void sil() {
			System.out.println("Başka bir şey");
		}
	}
}
