package entities;

public class BusinessAccount extends Account{
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
	@Override
	public void withdraw(double amount) {//chamo ele efetuado o que tem dentro do metodo depois que ele executa esse
		super.withdraw(amount);//chamo o metodo withdraw da classe account e tiro mais 2
		balance -= 2.0;
	}
		
}
