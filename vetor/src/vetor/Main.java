package vetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] vetor = new int [10];
		
		for (int i = 0 ; i < n; i++) {
			System.out.println("valor " + i  + " do vetor");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0 ; i < n; i++) {
			System.out.println("valor " + vetor[i]  + " do vetor");
		}
	}

}
