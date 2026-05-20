/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;
import br.unigran.domain.entity.Cliente;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;
/**
 *
 * @author vanes
 */


public class ClienteRepositoryimpl implements br.unigran.domain.repositories.ClienteRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object cliente) {
        dao.salvar(cliente);
    }

    @Override
    public List<Cliente> listarTodos() {
        return dao.listar("From Cliente", null);
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
        return dao.findById(id, Cliente.class);
    }
}