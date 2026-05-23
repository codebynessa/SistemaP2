/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Usuario;

/**
 *
 * @author vanes
 */
public class UsuarioDTO {
    
 public String nomeUsuario;
    public String loginUsuario;
    public String senhaUsuario;

    public UsuarioDTO(String nomeUsuario, String loginUsuario, String senhaUsuario) {

        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public Usuario build() {

        Usuario usuario = new Usuario();

        usuario.setNome(nomeUsuario);
        usuario.setLogin(loginUsuario);
        usuario.setSenha(senhaUsuario);

        return usuario;
    }
}