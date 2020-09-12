package entities;

public class SavingsAccount extends Account {
	private Double interstRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balancer, Double interstRate) {
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
}
