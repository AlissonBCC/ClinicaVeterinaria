package clinica.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Funcionario;

@Transactional
public interface FuncionarioDao extends CrudRepository<Funcionario, Long> {
	 
	  /**
	   * Return the user having the passed email or null if no user is found.
	   *
	   * @param email the user email.
	   */
	  public Funcionario findByEmail(String email);
	 
} // class FuncionarioDao

