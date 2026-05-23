/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Usuario;
import br.unigran.domain.repositories.UsuarioRepository;
import br.unigran.infra.repository.UsuarioRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarUsuarioUC {

    private Boolean atualizar = false;
    private final UsuarioRepository repository;

    public GerenciarUsuarioUC() {
        this.repository = new UsuarioRepositoryimpl();
    }

    public String salvarUsuario(Usuario usuario) throws Exception {

        atualizar = false;

        valida(usuario);

        repository.salvar(usuario);

        return "Usuário salvo com sucesso";
    }

    public String atualizar(Usuario usuario) throws Exception {

        atualizar = true;

        valida(usuario);

        repository.salvar(usuario);

        return "Usuário atualizado com sucesso";
    }

    public List listarTodos() {
        return repository.listar("From Usuario", null);
    }

    public void valida(Usuario usuario) throws Exception {

        if (usuario.getNome() == null || usuario.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        if (usuario.getLogin() == null || usuario.getLogin().isBlank()) {
            throw new Exception("Login vazio");
        }

        if (usuario.getSenha() == null || usuario.getSenha().isBlank()) {
            throw new Exception("Senha vazia");
        }

        if (atualizar && usuario.getId() == null) {
            throw new Exception("Id vazio");
        }
    }
}
