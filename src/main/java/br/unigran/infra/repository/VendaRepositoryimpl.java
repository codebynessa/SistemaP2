/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.Venda;
import br.unigran.domain.repositories.VendaRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */
public class VendaRepositoryimpl implements VendaRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object venda) {
        dao.salvar(venda);
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
        return dao.findById(id, Venda.class);
    }

    @Override
    public List<Venda> listarTodos() {
        return dao.listar("From Venda", null);
    }
}
