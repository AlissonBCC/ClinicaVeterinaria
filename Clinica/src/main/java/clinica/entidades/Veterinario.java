package clinica.entidades;

import javax.persistence.Entity;

@Entity
public class Veterinario extends Funcionario {

	private String crmv;

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

}
