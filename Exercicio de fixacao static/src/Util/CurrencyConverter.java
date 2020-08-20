package Util;

public class CurrencyConverter {
	public static double price;
	public static double bought;
	public static final double IOF = 0.06;
	
	public static double Converter() {
		double reais = price * bought;
		double t = reais * IOF;
		return reais + t;
	}

}
