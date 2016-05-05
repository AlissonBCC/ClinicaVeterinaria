package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mysql.fabric.xmlrpc.base.Data;

import clinica.entidades.Cliente;
import clinica.entidades.Funcionario;
import clinica.entidades.Negocio;

public interface NegocioDao extends CrudRepository<Negocio, Long> {
	
	List<Negocio> findByStatus(boolean status);
	List<Negocio> findByData(Data data);
	List<Negocio> findByFuncionario(Funcionario funcionario);
	List<Negocio> findByCliente(Cliente cliente);
}
