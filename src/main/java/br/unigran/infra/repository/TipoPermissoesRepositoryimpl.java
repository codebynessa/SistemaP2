/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.TipoPermissoes;
import br.unigran.domain.repositories.TipoPermissoesRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */

public class TipoPermissoesRepositoryimpl implements TipoPermissoesRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object tipoPermissao) {
        dao.salvar(tipoPermissao);
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
        return dao.findById(id, TipoPermissoes.class);
    }

    @Override
    public List<TipoPermissoes> listarTodos() {
        return dao.listar("From TipoPermissoes", null);
    }
}
