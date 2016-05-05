package clinica.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PessoaDao<T, ID extends Serializable> extends
		CrudRepository<T, ID> {

	T findById(long id);

	T findByEmail(String email);

	T findByCpf(String cpf);

}
