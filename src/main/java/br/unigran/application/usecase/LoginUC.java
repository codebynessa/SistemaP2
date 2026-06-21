/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Usuario;
import br.unigran.domain.repositories.UsuarioRepository;
import br.unigran.infra.repository.UsuarioRepositoryimpl;

/**
 *
 * @author vanes
 */
public class LoginUC {
  private final UsuarioRepository repository;

    public LoginUC() {
        this.repository = new UsuarioRepositoryimpl();
    }

    public Usuario validar(Usuario usuarioLogin) throws Exception {

        if (usuarioLogin.getLogin() == null || usuarioLogin.getLogin().isBlank()) {
            throw new Exception("Informe o login");
        }

        if (usuarioLogin.getSenha() == null || usuarioLogin.getSenha().isBlank()) {
            throw new Exception("Informe a senha");
        }

        Usuario usuarioBanco = repository.buscarPorLogin(usuarioLogin.getLogin());

        if (usuarioBanco == null) {
            throw new Exception("Usuário não encontrado");
        }

        if (!usuarioBanco.getSenha().equals(usuarioLogin.getSenha())) {
            throw new Exception("Senha incorreta");
        }

        return usuarioBanco;
    }
}
