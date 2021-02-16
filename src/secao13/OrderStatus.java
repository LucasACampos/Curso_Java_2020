package secao13;

public enum OrderStatus {
	
	PENDING_PAYMENT("Pending payment"),
	PROCESSING("Processing"),
	SHIPPED("Shipped"),
	DELIVERED("Delivered"),
	;
	
	private final String name;
	
	OrderStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
