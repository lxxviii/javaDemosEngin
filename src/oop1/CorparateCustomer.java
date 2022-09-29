package oop1;

public class CorparateCustomer extends Customer {

	private String companyName;
	private String taxNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public CorparateCustomer(String companyName, String taxNumber) {
		super();
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public CorparateCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
