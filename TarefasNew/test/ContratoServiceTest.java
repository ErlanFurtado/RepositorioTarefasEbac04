import br.com.erlan.dao.ContratoDao;
import br.com.erlan.dao.ContratoDaoMock;
import br.com.erlan.dao.IContratoDao;
import br.com.erlan.service.ContratoService;
import br.com.erlan.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

        @Test
        public void salvarTest() {
            IContratoDao mockDao = new ContratoDaoMock();
            IContratoService service = new ContratoService(mockDao);
            String retorno = service.salvar();
            Assert.assertEquals("Sucesso", retorno);
        }

        @Test(expected = UnsupportedOperationException.class)
        public void esperadoErroNoSalvarTest() {
            IContratoDao mockDao = new ContratoDao();
            IContratoService service = new ContratoService(mockDao);
            String retorno = service.salvar();
            Assert.assertEquals("Sucesso", retorno);
        }
        @Test
        public void buscar(){
            IContratoDao mockDao = new ContratoDaoMock();
            IContratoService service = new ContratoService(mockDao);
            String retorno = service.buscar();
            Assert.assertEquals("Buscar", retorno);
        }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IContratoDao mockDao = new ContratoDao();
        IContratoService service = new ContratoService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Buscar", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluir", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluir", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizar", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarsTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizar", retorno);
    }
}
