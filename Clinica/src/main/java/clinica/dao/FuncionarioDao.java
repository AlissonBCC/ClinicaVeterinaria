package clinica.dao;

import org.springframework.transaction.annotation.Transactional;

import clinica.entidades.Funcionario;

@Transactional
public interface FuncionarioDao extends PessoaDao<Funcionario, Long> {

	Funcionario findByCtps(String ctps);

} // class FuncionarioDao

