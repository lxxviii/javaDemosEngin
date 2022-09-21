package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product();

		product.setId(1);
		product.setName("Laptop");
		product.setDescription("ASUS Laptop");
		product.setPrice(5000.00);
		product.setStockAmount(3);
		product.setRenk("");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());

	}
}
