/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.MovimentacaoEstoque;
import br.unigran.domain.entity.Produto;
import java.util.Date;

/**
 *
 * @author vanes
 */
public class MovimentacaoEstoqueDTO {
   
   public String tipo;
    public String quantidade;
    public String idProduto;

    public MovimentacaoEstoqueDTO(String tipo, String quantidade, String idProduto) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }

    public MovimentacaoEstoque build() {
        MovimentacaoEstoque movimentacao = new MovimentacaoEstoque();

        movimentacao.setDataMovimentacao(new Date());
        movimentacao.setTipo(tipo);
        movimentacao.setQuantidade(Integer.valueOf(quantidade));

        Produto produto = new Produto();
        produto.setId(Integer.valueOf(idProduto));
        movimentacao.setProduto(produto);

        return movimentacao;
    }
}