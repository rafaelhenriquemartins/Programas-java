package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Enter department is name:");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		/*instanciei um novo objeto do tipo worker, os dados desse objeto é o workerName, 
		 * uma instancia de workerlevel no valor que digtei
		 * mais o valor de salary que digitei
		 * associado a esse objeto vai ter um outro objeto do tio=po departamento e o nome do
		 * departamento vai ser o ne=ome  que digitei
		 * 
		*/ 
		
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContact(contract);
			
		}
		
		System.out.println();
		System.out.println("Enter month and year to calcule income (DD/MM/YYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department  "+ worker.getDepartment().getName());
		System.out.println("Income for "+ monthAndYear +": "+String.format("%.2f", worker.income(year,month)));
		
		sc.close();

	}

}
