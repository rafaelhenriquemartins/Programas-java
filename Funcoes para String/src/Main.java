
public class Main {

	public static void main(String[] args) {

		String original = "            rafael HenRIque MarTINS                ";

		String caixa_baixa = original.toLowerCase();
		String caixa_alta = original.toUpperCase();

		String elemina_espacos = original.trim();
		String pega_caracter_apartir_da_posicao_2 = original.substring(2);
		String inicia_no_2_e_vai_ate_o_9 = original.substring(2, 20);
		String sempre_q_achar_uma_letra_trocar_por_outra = original.replace('a', 'X');

		String sempre_q_achar_a_frase_trocar = original.replace("rafa", "xyz");
		int primeira_ocorrencia_do_fa = original.indexOf("fa");
		int ultima_ocorrencia = original.lastIndexOf("ar");

		System.out.println("original " + original);
		System.out.println("toLowerCase " + caixa_baixa);
		System.out.println("toUpperCase " + caixa_alta);
		System.out.println("trim " + elemina_espacos);
		System.out.println("substring 2 " + pega_caracter_apartir_da_posicao_2);
		System.out.println("substring(2, 20) " + inicia_no_2_e_vai_ate_o_9);
		System.out.println("replace('a', 'X') " + sempre_q_achar_uma_letra_trocar_por_outra);
		System.out.println("replace(\"rafa\", \"xyz\") " + sempre_q_achar_a_frase_trocar);
		System.out.println("indexOf(\"fa\") " + primeira_ocorrencia_do_fa);
		System.out.println("lastIndexOf(\"ar\") " + ultima_ocorrencia);

		
		// forma um vetor com a parte separadora que eu informar na split
		
		String s = "batata banana maracuja";
		
		String[] vetor = s.split(" ");
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		
		
	}

}
