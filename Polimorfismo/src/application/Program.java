package application;

import entities.Account;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account x = new Account(1020, "alex", 1000.0);//conta comum nao cobra nada
		Account y = new SavingAccount(1023, "maria", 1000.0, 0.01);//conta poupanca tem descoto de 5
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalancer());
		System.out.println(y.getBalancer());
		
	}

}
