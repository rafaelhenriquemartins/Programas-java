import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Qtd_minutos_consumidos, valor_plano, custo_exeder_valor;
		valor_plano = 50;
		custo_exeder_valor = 2;
		
		System.out.println("Digite a quantidade de minutos que vc consumiu");
		Qtd_minutos_consumidos= sc.nextInt();
		
		if ( Qtd_minutos_consumidos > 100 ) {
			valor_plano += ((Qtd_minutos_consumidos -100)* custo_exeder_valor);
		}
			System.out.printf("sua fatura do mes é de %d reais", valor_plano);
					
		
	}

}
