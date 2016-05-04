package clinica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Especie {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	@ManyToOne
	private Raca raca;
	
	
	public Especie() {
	
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


	public Raca getRaca() {
		return raca;
	}


	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	
	
}
