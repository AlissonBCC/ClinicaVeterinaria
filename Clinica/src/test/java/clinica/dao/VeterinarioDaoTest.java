package clinica.dao;

import clinica.Boot;
import clinica.entidades.Veterinario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class VeterinarioDaoTest {
    @Autowired
    VeterinarioDao veterinarioDao;

    @Test
    public void findByCrmv() throws Exception {
        Veterinario veterinario = new Veterinario();
        veterinario.setCrmv("666");
        veterinarioDao.save(veterinario);

        assertEquals(veterinario.getCrmv(), veterinarioDao.findByCrmv(veterinario.getCrmv()).getCrmv());
    }
}