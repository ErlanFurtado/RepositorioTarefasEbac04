package br.com.erlan.service;

import br.com.erlan.dao.ContratoDao;
import br.com.erlan.dao.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao mockDao) {
        this.contratoDao = mockDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscar";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluir";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizar";
    }
}
