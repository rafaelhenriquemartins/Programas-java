import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
	
		int [] vetor = new int [n];
		
		
		for ( int i = 0; i < n; i ++) {
			System.out.println("vetor posição " + i);
			vetor[i]= sc.nextInt();

		}

			for ( int i = 0; i < n; i ++) {
				if ( vetor[i] < 0) {
					System.out.println(vetor[i]);
				}
			

	}
	}

}
