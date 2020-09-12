package entities;

public class BusinesAccount extends Account{
private Double loanlimit;
	
	public BusinesAccount() {
		super();
	}

	public BusinesAccount(Integer number, String holder, Double balancer, Double loanlimit) {
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
