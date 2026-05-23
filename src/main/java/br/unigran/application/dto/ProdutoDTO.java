/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;

/**
 *
 * @author vanes
 */
public class ProdutoDTO {
    public String nomeProduto;
    public String descricaoProduto;
    public String precoProduto;
    public String idCategoria;
    public String estoque;

    public ProdutoDTO(String nomeProduto, String descricaoProduto, String precoProduto, String idCategoria, String estoque) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.idCategoria = idCategoria;
        this.estoque = estoque;
    }

    public Produto build() {
        Produto produto = new Produto();

        produto.setNome(nomeProduto);
        produto.setDescricao(descricaoProduto);
        produto.setPrecoVenda(Double.valueOf(precoProduto));
        produto.setEstoqueAtual(Integer.valueOf(estoque));

        Categoria categoria = new Categoria();
        categoria.setId(Integer.valueOf(idCategoria));
        produto.setCategoria(categoria);

        return produto;
    }
}