package Student;

public class Student {
	public String name;
	public double nota1, nota2, nota3;
	public double nota;
	
	public String toString() {
		nota = nota1 + nota2 + nota3;
		return "nome: " + name + " Nota final: " + nota;
	}

	public void verifica() {
		if (nota > 60.0) {
			System.out.println(" Final Grade: " + nota + " PASS");
		} else {
			System.out.println("Final Grade: " + (100 - nota) + " FAILED");
		}
	}

}
