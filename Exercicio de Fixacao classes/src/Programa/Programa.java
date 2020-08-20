package Programa;

import java.util.Scanner;

import Cadastro.Cadastro_conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero da conta");
		String numero_conta = sc.next();
		System.out.println("digite o nome do titular");
		sc.nextLine();
		String nome_titular = sc.nextLine();
		System.out.println();
		
		Cadastro_conta cadastro_conta = new Cadastro_conta(numero_conta, nome_titular);
		
		
	
		System.out.println("deseja fazer um deposito? s/n");
		char deposito_opcional = sc.next().charAt(0);
		
		if (deposito_opcional == 's') {
			System.out.println("digite o valor de seu deposito");
			double deposito = sc.nextDouble();
			cadastro_conta.depositar(deposito);
			
		}
		System.out.println(" seu saldo esta com: " + cadastro_conta.getDeposito());
		System.out.println();
		System.out.println(" cadastro: " + cadastro_conta);
		
		System.out.println("vc esta depositando");
		cadastro_conta.depositar(200);
		System.out.println("vc esta depositando 200");
		System.out.println(" seu saldo esta com: " + cadastro_conta.getDeposito());
		System.out.println();
		System.out.println(" cadastro: " + cadastro_conta);
		
		System.out.println("voce esta sacando");
		cadastro_conta.sacar(300);
		System.out.println("voce esta sacando 90,98");
		System.out.println(" seu saldo esta com: " + cadastro_conta.getDeposito());
		System.out.println();
		System.out.println(" cadastro: " + cadastro_conta);
		
		
		System.out.println("voce esta sacando");
		cadastro_conta.sacar(11);
		System.out.println("voce esta sacando 11,00");
		System.out.println(" seu saldo esta com: " + cadastro_conta.getDeposito());
		System.out.println();
		System.out.println(" cadastro: " + cadastro_conta);
		
		
		sc.close();
	}

}
