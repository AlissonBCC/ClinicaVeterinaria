package clinica.entidades;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Medicamento extends Produto {

	private String nome;
	private String formula;
	private String usos;
	private String contras;

	public Medicamento() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getUsos() {
		return usos;
	}

	public void setUsos(String usos) {
		this.usos = usos;
	}

	public String getContras() {
		return contras;
	}

	public void setContras(String contras) {
		this.contras = contras;
	}

}
