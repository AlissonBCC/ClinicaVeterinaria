package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Animal;
import clinica.entidades.Cliente;

@Transactional
public interface AnimalDao extends CrudRepository<Animal, Long> {

	Animal findById(long id);
	//List<Animal> findByClienteId(long id);
	
	List<Animal> findByCliente(Cliente cliente);

} // class AnimalDao