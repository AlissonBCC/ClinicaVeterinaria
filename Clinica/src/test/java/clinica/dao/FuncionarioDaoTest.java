package clinica.dao;

import clinica.Boot;
import clinica.entidades.Cliente;
import clinica.entidades.Funcionario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class FuncionarioDaoTest {
    @Autowired
    FuncionarioDao funcionarioDao;

    @Test
    public void ctps() throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("29528013201");
        funcionario.setCtps("666");

        funcionarioDao.save(funcionario);
        assertEquals(funcionario.getCtps(), funcionarioDao.findByCtps(funcionario.getCtps()).getCtps());
    }
}