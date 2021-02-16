package secao13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
	
	private final List<OrderItem> orderItems;
	private Client client;
	private Date moment;
	private OrderStatus status;
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
		
		orderItems = new ArrayList<>();
	}
	
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public double total(){
		
		double sum = 0;
		
		for (OrderItem orderItem: orderItems) {
			sum += orderItem.subTotal();
		}
		
		return sum;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("ORDER SUMMARY:\n")
				.append("Order moment: ").append(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(this.moment)).append("\n")
				.append("Order status: ").append(status.getName()).append("\n")
				.append("Client: ").append(this.client.getName())
				.append(" (").append(new SimpleDateFormat("dd/MM/yyyy").format(client.getBirthDate())).append(") ")
				.append(" - ").append(client.getEmail()).append("\n")
				.append("Order items:\n");
		
		for ( OrderItem orderItem : orderItems) {
			
			Product product = orderItem.getProduct();
			
			stringBuilder.append(product.getName()).append(", ")
					.append("$").append(String.format(String.valueOf(product.getPrice()), "%.2f")).append(", ")
					.append("Quantity: ").append(orderItem.getQuantity()).append(", ")
					.append("Subtotal: ").append(orderItem.subTotal()).append("\n");
		}
		
		stringBuilder.append("Total price: $").append(total()).append("\n");
		
		return stringBuilder.toString();
	}
}
