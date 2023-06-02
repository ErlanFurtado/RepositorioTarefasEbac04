import br.com.erlan.dao.ClienteDao;
import br.com.erlan.dao.ClienteDaoMock;
import br.com.erlan.dao.IClienteDao;
import br.com.erlan.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test

    public void salvarTeste(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTeste(){
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
}
