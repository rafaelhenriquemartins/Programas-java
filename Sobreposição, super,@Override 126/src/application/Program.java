package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		//sobrepondo, em um metodo ele desconta 5 no outro não
		Account acc1 = new Account(1001,"alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalancer());
		
		Account cc2 = new SavingAccount(1002, "maria", 1000.0, 0.01);
		cc2.withdraw(200.0);
		System.out.println(cc2.getBalancer());
//-----------------------------------------------------------------------
	//Super, vou usar o desconto que ja tenho na classe account de 5, e somar com o desconto que 
		//vai ser cobrado de 2 no metodo da classe businessaccount
		
		Account cc3 = new BusinessAccount(1003, "rafael", 1000.0, 500.0);
		cc3.withdraw(200.0);//uso o metodo da super classe e da businessacoount
		System.out.println(cc3.getBalancer());
	}

}
