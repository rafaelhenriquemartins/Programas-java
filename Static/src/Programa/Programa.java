package Programa;

import java.util.Scanner;

import util.Cakcular;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" entre com o radius");
		double radius = sc.nextDouble();
		
		double c = Cakcular.circunferencia(radius);
		double v = Cakcular.volume(radius);
		
		System.out.printf(" circunferencia: %.2f%n", c);
		System.out.printf(" volume: %.2f%n", v);
		System.out.printf(" PI: %.2f%n", Cakcular.PI);
		
		

	}

}
