/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.EntradaProduto;
import br.unigran.domain.entity.ItemEntrada;
import br.unigran.domain.entity.MovimentacaoEstoque;

/**
 *
 * @author vanes
 */
public class ItemEntradaDTO {

    public String quantidade;
    public String custoUnitario;
    public String idEntradaProduto;
    public String idMovimentacaoEstoque;

    public ItemEntradaDTO(String quantidade, String custoUnitario, String idEntradaProduto, String idMovimentacaoEstoque) {
        this.quantidade = quantidade;
        this.custoUnitario = custoUnitario;
        this.idEntradaProduto = idEntradaProduto;
        this.idMovimentacaoEstoque = idMovimentacaoEstoque;
    }

    public ItemEntrada build() {
        ItemEntrada item = new ItemEntrada();

        int qtd = Integer.valueOf(quantidade);
        double custo = Double.valueOf(custoUnitario);

        item.setQuantidade(qtd);
        item.setCustoUnitario(custo);
        item.setSubtotal(qtd * custo);

        EntradaProduto entrada = new EntradaProduto();
        entrada.setId(Integer.valueOf(idEntradaProduto));
        item.setEntradaProduto(entrada);

        MovimentacaoEstoque mov = new MovimentacaoEstoque();
        mov.setId(Integer.valueOf(idMovimentacaoEstoque));
        item.setMovEstq(mov);

        return item;
    }
}