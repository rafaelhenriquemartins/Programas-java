package projetct;

import java.util.Date;
import java.util.Scanner;

import entities.Entidade;
import entidadEenum.Enum;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Entidade ent = new Entidade(33, "rafael", Enum.ANALISTA, new Date());
		
		int idade = sc.nextInt();
		String name = sc.next();
		String profisao = sc.next();
		
		
		Enum os = Enum.valueOf(profisao.toUpperCase());
		Entidade ent1 = new Entidade(idade,name,os, new Date());
		System.out.println(ent1);
		System.out.println(ent);

	}

}
