package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order order = new Order(1080,new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);
		
		
		//o usuario ira colocar o dado que esta em orderstatus e forma de string
		//como mudar de enum pra string
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println("digite");
	    String os2 = sc.next();
		
		OrderStatus x = OrderStatus.valueOf(os2);
		
		System.out.println(os1);
		System.out.println(x);
		
		
		
	}

}
