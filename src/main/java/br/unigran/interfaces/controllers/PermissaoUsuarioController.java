/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.PermissaoUsuarioDTO;
import br.unigran.application.usecase.GerenciarPermissaoUsuarioUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class PermissaoUsuarioController {
   static GerenciarPermissaoUsuarioUC uc = new GerenciarPermissaoUsuarioUC();

    public static void salvar(PermissaoUsuarioDTO dto) throws Exception {
        uc.salvarPermissao(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}
