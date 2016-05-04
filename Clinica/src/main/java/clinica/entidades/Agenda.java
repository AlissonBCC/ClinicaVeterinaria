package clinica.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Agenda {
	@Id
	@GeneratedValue
	private long id;
	private Date data;
	@OneToOne
	private Negocio negocio;
	@ManyToOne
	private Cliente cliente;
}
