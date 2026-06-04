/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.UsuarioDTO;
import br.unigran.application.usecase.GerenciarUsuarioUC;

/**
 *
 * @author vanes
 */
public class UsuarioController {

    static GerenciarUsuarioUC uc = new GerenciarUsuarioUC();

    public static void salvar(UsuarioDTO dto) throws Exception {

        uc.salvarUsuario(dto.build());

    }
}