package clinica.entidades;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;

    @Before
    public void setUp() throws Exception {
        this.animal = new Animal();
    }

    @Test
    public void id() throws Exception {
        this.animal.setId(666);
        assertEquals(666, this.animal.getId());
    }

    @Test
    public void nome() throws Exception {
        this.animal.setNome("maria");
        assertEquals("maria", this.animal.getNome());
    }

    @Test
    public void peso() throws Exception {
        this.animal.setPeso(666);
        assertTrue(666 == animal.getPeso());
    }

    @Test
    public void idade() throws Exception {
        this.animal.setIdade(666);
        assertEquals(666, this.animal.getIdade());
    }

    @Test
    public void calendario() throws Exception {
        List<Calendario> lista = new ArrayList<Calendario>();
        Calendario ca = new Calendario();
        lista.add(ca);

        this.animal.setCalendario(lista);
        assertTrue(this.animal.getCalendario().get(0).equals(ca));
    }

    @Test
    public void raca() throws Exception {
        Raca raca = new Raca();
        raca.setNome("maria");
        this.animal.setRaca(raca);
        assertEquals(raca, animal.getRaca());
    }

    @Test
    public void cliente() throws Exception {
        Cliente cliente = new Cliente();
        this.animal.setCliente(cliente);
        assertEquals(cliente, this.animal.getCliente());
    }

}