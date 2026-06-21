/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.domain.entity.Usuario;

/**
 *
 * @author vanes
 */
public class Sessao {
    private static Sessao instancia;
    private Usuario usuario;

    private Sessao() {
    }

    public static Sessao getInstance() {
        if (instancia == null) {
            instancia = new Sessao();
        }
        return instancia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean estaLogado() {
        return usuario != null;
    }

    public void sair() {
        usuario = null;
    }
}