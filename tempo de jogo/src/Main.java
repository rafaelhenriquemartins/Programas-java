import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que
//		o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
//
//		Entrada
//		A entrada cont�m dois valores inteiros representando a hora de in�cio e a hora de fim do jogo.
//
//		Sa�da
//		Apresente a dura��o do jogo conforme exemplo abaixo.
//
//		Exemplo de Entrada	Exemplo de Sa�da
//		16 2	 JOGO DUROU 10 HORA(S)
//
//		0 0		O JOGO DUROU 24 HORA(S)
//
//		2 16	O JOGO DUROU 14 HORA(S)

		Scanner sc = new Scanner(System.in);
		int hora_inicial, hora_termino, total1 = 0, total2 = 0, total3, total4;

		hora_inicial = sc.nextInt();
		hora_termino = sc.nextInt();

		if (hora_inicial != 0 && hora_termino != 0) {
			if (hora_inicial <= 12) {
				total1 = 12 - hora_inicial;

			}
			if (hora_inicial > 12) {
				total1 = 24 - hora_inicial;
			}
			if (hora_termino <= 12) {
				total2 = hora_termino;
			}

			if (hora_termino > 12) {
				total2 = hora_termino - 12;
			}
			System.out.printf("%d ", total1 + total2);
		} else {
			System.out.println("o jogo durou 24 horas");
		}

	}

}
