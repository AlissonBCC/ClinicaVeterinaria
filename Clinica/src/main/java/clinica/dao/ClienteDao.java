package clinica.dao;

import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Cliente;

@Transactional
public interface ClienteDao extends PessoaDao<Cliente, Long> {

} // class AnimalDao