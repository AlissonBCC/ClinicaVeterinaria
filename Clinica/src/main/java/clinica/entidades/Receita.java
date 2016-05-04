package clinica.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Receita {
	@Id
	@GeneratedValue
	private long id;
	@ManyToMany
	private List<Medicamento> medicamentos;
	private String descricao;
}
