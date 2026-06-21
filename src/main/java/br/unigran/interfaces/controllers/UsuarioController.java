/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.UsuarioDTO;
import br.unigran.application.usecase.GerenciarUsuarioUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class UsuarioController {

  static GerenciarUsuarioUC uc = new GerenciarUsuarioUC();

    public static void salvar(UsuarioDTO dto) throws Exception {
        uc.salvarUsuario(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}