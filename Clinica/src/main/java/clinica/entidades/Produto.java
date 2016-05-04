package clinica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Produto {
	@Id
	@GeneratedValue
	private long id;
	private double preco;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
