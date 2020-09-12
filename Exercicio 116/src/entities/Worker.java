package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entitiesEnum.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double basaSalary;
	// no cenario que estou olhando vejo que meu Worker esta ligado a duas outras
	// classes, Departmen e HourContract
	// para a department vi que a a situaçã de 1 para 1 então fica assim:
	private Department department;
	// e para HourContract é de um pra muitos, então colocamos ele em uma lista
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double basaSalary, Department department) {
		this.name = name;
		this.level = level;
		this.basaSalary = basaSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBasaSalary() {
		return basaSalary;
	}

	public void setBasaSalary(double basaSalary) {
		this.basaSalary = basaSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContact(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);

	}

	public double income(int year, int month) {
		double sum =basaSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
