package clinica.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Animal {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private double peso;
	private int idade;
	@ManyToMany
	private List<Calendario> calendario;
	@ManyToOne
	private Especie especie;
	@ManyToOne
	private Cliente cliente;
	
	
	
	public Animal() {
	
	
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Calendario> getCalendario() {
		return calendario;
	}
	public void setCalendario(List<Calendario> calendario) {
		this.calendario = calendario;
	}
	public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
	
}
