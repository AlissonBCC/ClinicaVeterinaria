package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import clinica.entidades.Medicamento;

public interface MedicamentoDao extends CrudRepository<Medicamento, Long> {
	Medicamento findByNome(String nome);
	List<Medicamento> findByUsoContaining(String uso);
}
