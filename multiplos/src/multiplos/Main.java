package multiplos;

import java.util.Scanner;

public class Main {
//	Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
//	indicando se os valores lidos s�o m�ltiplos entre si.
//
//	Entrada
//	A entrada cont�m valores inteiros.
//
//	Sa�da
//	A sa�da deve conter uma das mensagens conforme descrito acima.
//
//	Exemplo de Entrada	Exemplo de Sa�da
//	6 24	Sao Multiplos
//
//	6 25	Nao sao Multiplos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, resto;
		A = sc.nextInt();
		B = sc.nextInt(); 

		if (A > B) {
			resto = A % B;
			if (resto == 0)
				System.out.println("sao multiplos");
			else {
				System.out.println("nao sao multiplos");
			}
		}
		if (B > A) {
			resto = B % A;
			if (resto == 0) {
				System.out.println("sao multiplos");
			}
			else {
				System.out.println("nao sao multiplos");
			}
		}
			
		}

	}


