package clinica.entidades;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Negocio {
	@Id
	@GeneratedValue
	private long id;
	private double preco;
	private boolean status;
	private Date data;
	@ManyToOne
	private Funcionario funcionario;
	@OneToMany
	private List<Produto> produtos;
}
