package employes;

public class Employes {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = grossSalary * (percentage / 100);
		System.out.println("update: " + grossSalary);
	}

	public String toString() {
		return "Name: " + name + " salary: " + grossSalary;

	}

}
