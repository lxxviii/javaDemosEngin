package oop1;

public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageURL;
	private int unitInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public Product(String name, double unitPrice, double discount, String imageURL, int unitInStock) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.imageURL = imageURL;
		this.unitInStock = unitInStock;
	}

	public Product() {

	}
}
