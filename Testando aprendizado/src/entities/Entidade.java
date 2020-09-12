package entities;

import java.util.Date;

public class Entidade {
	private Integer idade;
	private String name;
	private Enum profisao;
	private Date date;
	
	public Entidade() {
		
	}
	public Entidade(Integer idade, String name, Enum profisao, Date date) {
		this.idade = idade;
		this.name = name;
		this.profisao = profisao;
		this.date = date;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum getProfisao() {
		return profisao;
	}
	public void setProfisao(Enum profisao) {
		this.profisao = profisao;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Entidade [idade=" + idade + ", name=" + name + ", profisao=" + profisao + ", date=" + date + "]";
	}
	

}
