package br.unigran.interfaces.controllers;


import br.unigran.application.dto.PagamentoDTO;
import br.unigran.application.usecase.GerenciarPagamentoUC;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class PagamentoController {
  static GerenciarPagamentoUC uc = new GerenciarPagamentoUC();

    public static void salvar(PagamentoDTO dto) throws Exception {
        uc.salvarPagamento(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
}