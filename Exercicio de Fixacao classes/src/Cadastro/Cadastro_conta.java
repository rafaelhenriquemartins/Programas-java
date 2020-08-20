package Cadastro;

public class Cadastro_conta {
	private String numero_conta;
	public String nome_titular;
	private double deposito;

	public Cadastro_conta(String numero_conta, String nome_titular) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;

	}

	public String getNumeroConta() {
		return numero_conta;
	}

	public void setNumeroConta(String numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getNomeTitular() {
		return nome_titular;
	}

	public double getDeposito() {
		return deposito;
	}

	public void depositar(double depositar) {
		this.deposito += depositar;
	}

	public void sacar(double sacar) {
		if (this.deposito > (sacar + 5)) {
			this.deposito -= (sacar + 5.0);
		}else {
			System.out.println("saldo insuficiente!!!");
		}
	}

	public String toString() {
		return " Nome Titular: " + nome_titular + " Numero da conta: " + numero_conta + " Valor em deposito: "
				+ deposito;

	}
}
