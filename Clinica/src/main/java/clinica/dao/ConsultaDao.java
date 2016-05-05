package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import clinica.entidades.Animal;
import clinica.entidades.Consulta;
import clinica.entidades.Veterinario;

public interface ConsultaDao extends CrudRepository<Consulta, Long> {

	List<Consulta> findByVeterinario(Veterinario veterinario);

	List<Consulta> findByAnimal(Animal animal);

}
