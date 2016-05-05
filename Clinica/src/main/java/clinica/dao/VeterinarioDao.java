package clinica.dao;

import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Veterinario;

@Transactional
public interface VeterinarioDao extends PessoaDao<Veterinario, Long> {

	Veterinario findByCrmv(String crmv);

}
