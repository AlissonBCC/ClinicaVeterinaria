package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Medicamento;
@Transactional
public interface MedicamentoDao extends CrudRepository<Medicamento, Long> {
	Medicamento findByNome(String nome);
	List<Medicamento> findByUsosContaining(String usos);
}
