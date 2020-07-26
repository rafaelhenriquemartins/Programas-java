package tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			int soma = N * i;
			System.out.println(N + " x "+ i + " = " + soma);
		}
	}

}
