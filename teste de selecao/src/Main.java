import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e
//		a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A 
//		for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".
//
//		Entrada
//		Quatro n�meros inteiros A, B, C e D.
//
//		Sa�da
//		Mostre a respectiva mensagem ap�s a valida��o dos valores.
//
//		Exemplo de Entrada	Exemplo de Sa�da
//		5 6 7 8-		Valores nao aceitos
//
//		2 3 2 6		Valores aceitos

		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		if (B > C && D > A) {
			int soma_C_D = C + D;
			int soma_A_B = A + B;
			if (soma_C_D > soma_A_B && C > 0 && D > 0) {
				if (A % 2 == 0) {
					System.out.println("valores aceitos");
				}
			}
		} else {
			System.out.println("valores n�o aceitos");
		}
	}

}
