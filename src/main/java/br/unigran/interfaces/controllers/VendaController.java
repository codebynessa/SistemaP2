/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.VendaDTO;
import br.unigran.application.usecase.GerenciarVendaUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class VendaController {

    static GerenciarVendaUC uc = new GerenciarVendaUC();

    public static void salvar(VendaDTO dto) throws Exception {
        uc.salvarVenda(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}
