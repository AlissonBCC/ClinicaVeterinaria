package clinica.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Animal;

@Transactional
public interface AnimalDao extends CrudRepository<Animal, Long> {
	 
	  /**
	   * Return the user having the passed email or null if no user is found.
	   *
	   * @param email the user email.
	   */
	  public Animal findById(long id);
	 
} // class AnimalDao