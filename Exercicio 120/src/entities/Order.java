package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.OrdrStatus;

public class Order {
	private Date moment;
	private OrdrStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	public Order() {	
	}
	
	public Order(Date moment, OrdrStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdrStatus getStatus() {
		return status;
	}

	public void setStatus(OrdrStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for(OrderItem it : items) {
			sum = sum + it.subTotal();
		}
		return sum;	
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append( status + "\n");
		sb.append("Client: " );
		sb.append(client + "\n");
		sb.append("Order item: \n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $ ");
		sb.append(String.format("%.2f",total()));
		return sb.toString();
		
	}
	
}
