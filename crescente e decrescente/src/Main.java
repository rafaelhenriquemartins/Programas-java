import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem 
//		que indique se estes valores foram digitados em ordem crescente ou decrescente.
//
//		Entrada
//		A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores inteiros X e Y. A leitura deve ser 
//		encerrada ao ser fornecido valores iguais para X e Y.
//
//		Sa�da
//		Para cada caso de teste imprima �Crescente�, caso os valores tenham sido digitados na ordem crescente, 
//		caso contr�rio imprima a mensagem �Decrescente�.
//
//		Exemplo de Entrada	Exemplo de Sa�da
//		5 4                 Decrescente
//		7 2                 Decrescente
//		3 8                 Crescente
//		2 2   
//
//		
//		
//		

		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 0;

		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != Y) {
			if (X > Y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();

		}
		System.out.println("FIM DAVERIFICA��O");

	}

}
