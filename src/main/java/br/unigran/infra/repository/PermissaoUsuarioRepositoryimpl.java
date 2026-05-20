/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.PermissaoUsuario;
import br.unigran.domain.repositories.PermissaoUsuarioRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */
public class PermissaoUsuarioRepositoryimpl implements PermissaoUsuarioRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object permissaoUsuario) {
        dao.salvar(permissaoUsuario);
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
        return dao.findById(id, PermissaoUsuario.class);
    }

    @Override
    public List<PermissaoUsuario> listarTodos() {
        return dao.listar("From PermissaoUsuario", null);
    }
}