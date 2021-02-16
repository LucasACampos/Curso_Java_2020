package secao13;

public class OrderItem {
	
	private int quantity;
	private Product product;
	
	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public double subTotal(){
		return this.product.getPrice() * quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
}
