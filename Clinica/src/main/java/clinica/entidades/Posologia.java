package clinica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Posologia {
	@Id
	@GeneratedValue
	private long id;
	private String mododeuso;
	@ManyToOne
	private Medicamento medicamento;
	@OneToOne
	private Receita receita;

	public Posologia() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMododeuso() {
		return mododeuso;
	}

	public void setMododeuso(String mododeuso) {
		this.mododeuso = mododeuso;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

}
