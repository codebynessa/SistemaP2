/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.services;

import br.unigran.domain.entity.Usuario;

/**
 *
 * @author vanes
 */
public class Sessao {
 
    private Usuario usuario;
    private static Sessao sessao;

    private Sessao() {
    }

    public static Sessao getInstance() {
        if (sessao == null) {
            sessao = new Sessao();
        }
        return sessao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void limpar() {
        this.usuario = null;
    }

    public boolean estaLogado() {
        return usuario != null;
    }
}