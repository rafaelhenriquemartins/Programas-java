package entities;

public class SavingAccount extends Account {
	private Double interstRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balancer, Double interstRate) {
		super(number, holder, balancer);
		this.interstRate = interstRate;
	}

	public Double getInterstRate() {
		return interstRate;
	}

	public void setInterstRate(Double interstRate) {
		this.interstRate = interstRate;
	}

	public void updateBalance() {
		balance += balance * interstRate;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
