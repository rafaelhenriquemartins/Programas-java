import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] vetor = new String[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.next();
			
		}
		for(String s : vetor) {
			System.out.println(s);
		}

	}

}
