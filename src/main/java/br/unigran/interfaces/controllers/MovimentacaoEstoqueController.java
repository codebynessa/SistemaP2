package br.unigran.interfaces.controllers;


import br.unigran.application.dto.MovimentacaoEstoqueDTO;
import br.unigran.application.usecase.GerenciarMovimentacaoEstoqueUC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class MovimentacaoEstoqueController {
    

    static GerenciarMovimentacaoEstoqueUC uc = new GerenciarMovimentacaoEstoqueUC();

    public static void salvar(MovimentacaoEstoqueDTO dto) throws Exception {
        uc.salvarMovimentacao(dto.build());
    }
}