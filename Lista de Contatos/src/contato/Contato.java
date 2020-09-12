package contato;

public class Contato {
	private int id = 0;
	private String nome;
	private int idade;
	
	public Contato() {}
	
	public Contato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void getNome() {
		this.nome = nome;
	}
	public String setNome(String nome) {
		return nome;
	}
	public void getIdade() {
		this.idade = idade;
	}
	public int setIdade(int idade) {
		return idade;
	}
	public int setId(int id) {
		return id;
	}
	public int geraId(int id) {
		return id += 1;
	}
	
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	}
