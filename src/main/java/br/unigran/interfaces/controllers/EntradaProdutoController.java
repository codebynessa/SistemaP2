/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.EntradaProdutoDTO;
import br.unigran.application.usecase.GerenciarEntradaProdutoUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class EntradaProdutoController {
    

 static GerenciarEntradaProdutoUC uc = new GerenciarEntradaProdutoUC();

    public static void salvar(EntradaProdutoDTO dto) throws Exception {
        uc.salvarEntradaProduto(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}