package Main;

import java.util.Scanner;

import Student.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println(" digite o nome");
		student.name = sc.next();
		System.out.println(" digite a 1 nota");
		student.nota1 = sc.nextDouble();
		System.out.println(" digite a 2 nota");
		student.nota2 = sc.nextDouble();
		System.out.println(" digite a 3 nota");
		student.nota3 = sc.nextDouble();
		
		System.out.println(student);

		student.verifica();
		
	

		


	}

}
