import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser
		 * no mês de Abril, iniciando e terminando dentro do mês. O problema é que
		 * Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe
		 * quando inicia e quando termina o evento.
		 * 
		 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá
		 * ajudar Pedrinho a calcular a duração deste evento.
		 * 
		 * Entrada Como entrada, na primeira linha vai haver a descrição “Dia”, seguido
		 * de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte,
		 * será informado o momento no qual o evento vai iniciar, no formato hh : mm :
		 * ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo
		 * formato das duas primeiras linhas, indicando o término do evento.
		 * 
		 * Saída Na saída, deve ser apresentada a duração do evento, no seguinte
		 * formato:
		 * 
		 * W dia(s) X hora(s) Y minuto(s) Z segundo(s)
		 * 
		 * Obs: Considere que o evento do caso de teste para o problema tem duração
		 * mínima de 1 minuto.
		 * 
		 */
		int dia_inicio, dia_termino, hora_inicio, hora_termino, min_inicio, min_termino, seg_inicio, seg_termino,
				duracao_inicio, duracao_termino, duracao;
		int resto_inicio, cal_dia_inicio, cal_hora_inicio, cal_min_inicio;
		int cal_dia_termino, cal_hora_termino, cal_min_termino;
		double conta_final_inicio;

		System.out.println("Digite o dia de inicio");
		dia_inicio = sc.nextInt();
		System.out.println("Digite a hora de inicio");
		hora_inicio = sc.nextInt();
		System.out.println("Digite o minuto de inicio");
		min_inicio = sc.nextInt();
		System.out.println("Digite o segundo de inicio");
		seg_inicio = sc.nextInt();

		System.out.println("Digite o dia do termino");
		dia_termino = sc.nextInt();
		System.out.println("Digite a hora do termino");
		hora_termino = sc.nextInt();
		System.out.println("Digite o minuto do termino");
		min_termino = sc.nextInt();
		System.out.println("Digite o segundo do termino");
		seg_termino = sc.nextInt();

		cal_dia_inicio = dia_inicio * 24 * 60 * 60;
		cal_hora_inicio = hora_inicio * 60 * 60;
		cal_min_inicio = min_inicio * 60;
		duracao_inicio = cal_dia_inicio + cal_hora_inicio + cal_min_inicio + seg_inicio;

		cal_dia_termino = dia_termino * 24 * 60 * 60;
		cal_hora_termino = hora_termino * 60 * 60;
		cal_min_termino = min_termino * 60;
		duracao_termino = cal_dia_termino + cal_hora_termino + cal_min_termino + seg_termino;

		duracao = duracao_termino - duracao_inicio;

		System.out.printf("Duração total em segundos: %d %n", duracao);

		conta_final_inicio = duracao / (24 * 60 * 60);
		resto_inicio = duracao % (24 * 60 * 60);

		System.out.println(conta_final_inicio + " Dias");

		conta_final_inicio = resto_inicio / (60 * 60);
		resto_inicio = resto_inicio % (60 * 60);

		System.out.println(conta_final_inicio + " Horas");

		conta_final_inicio = resto_inicio / (60);
		resto_inicio = resto_inicio % 60;

		System.out.println(conta_final_inicio + " Minutos");
		System.out.println(resto_inicio + " Segundos");
	
		sc.close();

	}

}
