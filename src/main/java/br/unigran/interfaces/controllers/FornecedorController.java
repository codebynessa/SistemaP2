/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.FornecedorDTO;
import br.unigran.application.usecase.GerenciarFornecedorUC;

/**
 *
 * @author vanes
 */

public class FornecedorController {

    static GerenciarFornecedorUC uc = new GerenciarFornecedorUC();

    public static void salvar(FornecedorDTO dto) throws Exception {

        uc.salvarFornecedor(dto.build());

    }
}
