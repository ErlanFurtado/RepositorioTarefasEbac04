package br.com.erlan.service;

import br.com.erlan.dao.ClienteDao;
import br.com.erlan.dao.ClienteDaoMock;
import br.com.erlan.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;
    public ClienteService(IClienteDao clienteDao){
       // clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }
    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";

    }
}
