package clinica.entidades;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class PessoaTest {
    private Pessoa pessoa;
    private static Validator validator;

    @Before
    public void setUp() throws Exception {
        this.pessoa = new Pessoa();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void id() throws Exception {
        pessoa.setId(666);
        assertEquals(666, pessoa.getId());
    }

    @Test
    public void nome() throws Exception {
        pessoa.setNome("maria");
        assertEquals("maria", pessoa.getNome());
    }

    @Test
    public void cpf() throws Exception {
        pessoa.setCpf("77241688651"); // cpf válido
        assertEquals("77241688651", pessoa.getCpf());
    }

    @Test(expected = AssertionError.class)
    public void invalidCpf() throws Exception {
        pessoa.setCpf("12345678912"); // cpf inválido
        Set<ConstraintViolation<Pessoa>> constraintViolations = validator.validate( pessoa );
        assertEquals( 1, constraintViolations.size() ); // tem que haver pelo menos 1 erro de validação
        assertEquals("may not be null", constraintViolations.iterator().next().getMessage()); // tem que dar erro
    }

    @Test
    public void setSenha() throws Exception {
        pessoa.setSenha("allahuAkbar");
    }

    @Test
    public void telefone() throws Exception {
        pessoa.setTelefone("87999225541");
        assertEquals("87999225541", pessoa.getTelefone());
    }

    @Test
    public void email() throws Exception {
        pessoa.setEmail("maria@google.com");
        assertEquals("maria@google.com", pessoa.getEmail());
    }

    @Test
    public void endereco() throws Exception {
        Endereco end = new Endereco();
        end.setBairro("aquele");
        end.setCep("666");
        end.setCidade("maria city");
        end.setComplemento("perto da casa da mikasa");
        end.setEstado("AC");
        end.setNumero("0");
        end.setRua("Rua dos bobos");

        pessoa.setEndereco(end);
        assertTrue(end.equals(pessoa.getEndereco()));
    }
}