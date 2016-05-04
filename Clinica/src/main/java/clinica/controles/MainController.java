package clinica.controles;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import clinica.dao.ClienteDao;
import clinica.entidades.Cliente;
import clinica.entidades.Endereco;

@Controller
public class MainController {
  @Autowired
  ClienteDao clienteDao;
	
  @RequestMapping("/")
  @ResponseBody
  public String index() {
	  
  	Endereco end = new Endereco();
  	end.setRua("A");
  	end.setCep("44444");
  	end.setCidade("gus");
  	end.setId(1);
  	Cliente cliente = new Cliente();
  	cliente.setEndereco(end);
  	cliente.setNome("fulano");
  	cliente.setId(1);
  	
  	clienteDao.save(cliente);  
	  
    return "Proudly handcrafted by " +
        "<a href='http://netgloo.com/en'>netgloo</a> :)";
  }

}
