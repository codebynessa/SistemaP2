/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.TipoPermissoesDTO;
import br.unigran.application.usecase.GerenciarTipoPermissoesUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class TipoPermissoesController {

    static GerenciarTipoPermissoesUC uc = new GerenciarTipoPermissoesUC();

    public static void salvar(TipoPermissoesDTO dto) throws Exception {
        uc.salvarTipoPermissao(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}
