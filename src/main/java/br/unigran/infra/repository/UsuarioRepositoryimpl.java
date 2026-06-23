/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.Usuario;
import br.unigran.domain.repositories.UsuarioRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */
public class UsuarioRepositoryimpl implements UsuarioRepository {

    JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object usuario) {
        dao.salvar(usuario);
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
        return dao.findById(id, Usuario.class);
    }

    @Override
    public List<Usuario> listarTodos() {
        return dao.listar("SELECT u FROM Usuario u", null);
    }
@Override
public Usuario buscarPorLogin(String login) {
    List<Usuario> usuarios = dao.listar(
            "SELECT u FROM Usuario u WHERE u.login = '" + login + "'",
            null
    );

    if (usuarios == null || usuarios.isEmpty()) {
        return null;
    }

    return usuarios.get(0);
}
}