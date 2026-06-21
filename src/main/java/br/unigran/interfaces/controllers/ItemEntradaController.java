/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.ItemEntradaDTO;
import br.unigran.application.usecase.GerenciarItemEntradaUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class ItemEntradaController {
    

    static GerenciarItemEntradaUC uc = new GerenciarItemEntradaUC();

    public static void salvar(ItemEntradaDTO dto) throws Exception {
        uc.salvarItemEntrada(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}