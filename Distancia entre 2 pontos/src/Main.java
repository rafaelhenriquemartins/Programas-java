import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
		 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles,
		 * mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:
		 * 
		 * Distancia =
		 * 
		 * Entrada O arquivo de entrada cont�m duas linhas de dados. A primeira linha
		 * cont�m dois valores de ponto flutuante: x1 y1 e a segunda linha cont�m dois
		 * valores de ponto flutuante x2 y2.
		 * 
		 * Sa�da Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com
		 * 4 casas ap�s o ponto decimal
		 */

		double p1_x1, p1_y1, p2_x2, p2_y2, distancia;

		p1_x1 = sc.nextDouble();
		p1_y1 = sc.nextDouble();
		p2_x2 = sc.nextDouble();
		p2_y2 = sc.nextDouble();
		
		
		distancia = Math.pow(p2_x2 - p1_x1, 2) + Math.pow(p2_y2 - p1_y1, 2);
		
		distancia = Math.sqrt(distancia);
		
		System.out.println(distancia);

	}

}
