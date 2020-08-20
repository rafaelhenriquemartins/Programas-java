package Program;

import java.util.Scanner;

import Util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price");
		CurrencyConverter.price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.bought = sc.nextDouble();
		double c = CurrencyConverter.Converter();
		System.out.println(" Amount to be paid in reais " + c);
		
			

	}

}
