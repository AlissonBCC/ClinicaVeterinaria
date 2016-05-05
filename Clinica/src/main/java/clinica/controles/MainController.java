package clinica.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinica.dao.AnimalDao;
import clinica.dao.ClienteDao;
import clinica.dao.FuncionarioDao;
import clinica.entidades.Animal;
import clinica.entidades.Cliente;
import clinica.entidades.Endereco;
import clinica.entidades.Funcionario;

@Controller
public class MainController {
	@Autowired
	FuncionarioDao funcDao;
	@Autowired
	ClienteDao clienteDao;	
	@Autowired
	AnimalDao animalDao;

	@RequestMapping("/")
	@ResponseBody
	public String index() {

		Endereco end = new Endereco();
		end.setRua("B");
		end.setCep("55555");
		end.setCidade("gus");
		end.setBairro("bairro");
		end.setComplemento("comp");
		end.setEstado("PE");
		end.setNumero("434");

		Funcionario func = new Funcionario();
		func.setCpf("xxx.xxx.xxx.xx");
		func.setNome("jack");
		func.setCtps("CTPS.XXXX");
		func.setEmail("mail@mail.com");
		func.setEndereco(end);
		func.setSalario(50000);
		func.setSenha("1234");
		func.setTelefone("(87)XXXXX-XXXX");
		
		Cliente cliente = new Cliente();
		cliente.setCpf("123.123.123-12");
		cliente.setNome("cliente");
		cliente.setEmail("cli@mail.com");
		cliente.setEndereco(end);
		cliente.setSenha("321");
		cliente.setTelefone("00993322");
		
		Animal animal = new Animal();
		Animal animal2 = new Animal();
		animal.setCliente(cliente);
		animal.setNome("rex");
		animal2.setCliente(cliente);
		animal2.setNome("maria");
		
		
		funcDao.save(func);
		clienteDao.save(cliente);
		animalDao.save(animal);
		animalDao.save(animal2);
		

		//return animalDao.findByClienteId(1).get(1).getNome();
		return animalDao.findByCliente(cliente).get(0).getNome();
	}

}
