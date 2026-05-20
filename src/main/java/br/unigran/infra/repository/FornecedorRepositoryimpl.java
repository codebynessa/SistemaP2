/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;


import br.unigran.domain.entity.Fornecedor;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;
/**
 *
 * @author vanes
 */

public class FornecedorRepositoryimpl implements br.unigran.domain.repositories.FornecedorRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object fornecedor) {
        dao.salvar(fornecedor);
    }

    @Override
    public List<Fornecedor> listarTodos() {
        return dao.listar("From Fornecedor", null);
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
        return dao.findById(id, Fornecedor.class);
    }
}