package entities;

public class BusinessAccount extends Account{// assim estou definindo que essa classe tera todos os
	//vai ter todos os dados e comportamento da classe Accont

	private Double loanlimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balancer, Double loanlimit) {
		super(number, holder, balancer);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	public void loan(double amount) {
		if(amount <= loanlimit) {
			balance += amount -10.0;
		}
	}
}
