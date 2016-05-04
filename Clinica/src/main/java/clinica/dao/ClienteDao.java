package clinica.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Cliente;

@Transactional
public interface ClienteDao extends CrudRepository<Cliente, Long> {
	 
	  /**
	   * Return the user having the passed email or null if no user is found.
	   *
	   * @param email the user email.
	   */
	  public Cliente findById(long id);
	 
} // class AnimalDao