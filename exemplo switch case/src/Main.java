import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia_semana;
		dia_semana = sc.nextInt();
		
		switch (dia_semana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("ter�a");
			break;
		case 4:
			System.out.println(" quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		default:
			System.out.println("sabado");
		}
	}

}
