/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.Pagamento;
import br.unigran.domain.repositories.PagamentoRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */
public class PagamentoRepositoryimpl implements PagamentoRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object pagamento) {
        dao.salvar(pagamento);
    }

    @Override
    public void remover(Object o) {
        dao.remover(o);
    }

    @Override
    public List listar(String quere, String[] parametros) {
        return dao.listar(quere, parametros);
    }

    @Override
    public Object findByID(Integer id) {
        return dao.findById(id, Pagamento.class);
    }

    @Override
    public List<Pagamento> listarTodos() {
        return dao.listar("From Pagamento", null);
    }
}
