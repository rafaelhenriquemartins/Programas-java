import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l1, l2, l3;

		l1 = sc.nextInt();
		l2 = sc.nextInt();
		l3 = sc.nextInt();

		if (l1 < l2 && l1 < l3) {
			System.out.println(l1);

		}
		else {
			if (l2 < l1 && l2 < l3) {
				System.out.println(l2);
			}
		    else {
		    	System.out.println(l3);
		    }

		
	}
		sc.close();
}
}