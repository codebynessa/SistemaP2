/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.ProdutoDTO;
import br.unigran.application.usecase.GerenciarProdutoUC;
import br.unigran.domain.entity.Produto;
import java.util.List;

/**
 *
 * @author vanes
 */
public class ProdutoController {
    
   static GerenciarProdutoUC uc = new GerenciarProdutoUC();

    public static void salvar(ProdutoDTO dto) throws Exception {
        uc.cadastrarProduto(dto.build());
    }

    public static void editar(ProdutoDTO dto) throws Exception {
        uc.atualizar(dto.build());
    }

    public static void excluir(Integer id) throws Exception {
        Produto produto = new Produto();
        produto.setId(id);

        uc.remover(produto);
    }

    public static List<Produto> listarTodos() {
        return uc.listarTodos();
    }
}