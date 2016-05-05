package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Animal;
import clinica.entidades.Consulta;
import clinica.entidades.Veterinario;
@Transactional
public interface ConsultaDao extends CrudRepository<Consulta, Long> {

	List<Consulta> findByVeterinario(Veterinario veterinario);

	List<Consulta> findByAnimal(Animal animal);

}
