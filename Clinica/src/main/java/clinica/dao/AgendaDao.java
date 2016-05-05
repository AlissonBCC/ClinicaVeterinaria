package clinica.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mysql.fabric.xmlrpc.base.Data;

import clinica.entidades.Agenda;
import clinica.entidades.Cliente;

public interface AgendaDao extends CrudRepository<Agenda, Long> {
	
	List<Agenda> findByNegocioCliente(Cliente cliente);
	List<Agenda> findByData(Data data);
	
}
