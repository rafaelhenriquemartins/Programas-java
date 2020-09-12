package listadecontatos;

import java.util.ArrayList;
import java.util.Scanner;

import contato.Contato;

public class ListaDeContato {

	public static void main(String[] args) {
		ArrayList<Contato> contatos = new ArrayList<>();
		Contato cont = new Contato("rafael", 12 );
		Scanner sc = new Scanner(System.in);
	
		contatos.add(cont);
		
		for(Contato c : contatos) {
			System.out.println(c.toString());
		}
		
	
	sc.close();
		
		
	}

}
