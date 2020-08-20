package apllication;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 10;

		Product[] vect = new Product[n];

		System.out.println("numero de estudantes");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("email: ");
			String email = sc.nextLine();

			System.out.println("room: ");
			int room = sc.nextInt();

			vect[room] = new Product(name, email, room);
		}

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
			System.out.println(vect[i]);
			}
		}
	}

}
