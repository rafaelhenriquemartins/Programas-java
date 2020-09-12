package applicaton;

import entities.Account;
import entities.BusinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "alex", 0.0);
		
		BusinesAccount bacc = new BusinesAccount(1002, "maria", 0.0, 500.0);
		
		// UPCASTING seria eu pegar um objeto do tipo businessaccount e atribuir para uma variavel do tpo account
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "anna", 0.0, 0.01);
		
		// DOWNCASTING é converter um objeto da superclasse para a subclasse. o inverso do de cima
		BusinesAccount acc4 = (BusinesAccount)acc2;
		acc4.loan(100.0);
		
		// testando um objeto
		if (acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("updateBalance");
		}
	}

}
