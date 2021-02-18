package secao14;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	
	private Date manufactureDate;
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + "(used) $ " + String.format("%.2f", price) + "(Manufactured date: " + new SimpleDateFormat("dd/MM/yyyy").format(manufactureDate) + ")";
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
