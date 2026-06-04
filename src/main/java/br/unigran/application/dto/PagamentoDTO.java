/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Pagamento;
import br.unigran.domain.entity.Venda;

/**
 *
 * @author vanes
 */
public class PagamentoDTO {
    public String tipo;
    public String valor;
    public String idVenda;

    public PagamentoDTO(String tipo, String valor, String idVenda) {
        this.tipo = tipo;
        this.valor = valor;
        this.idVenda = idVenda;
    }

    public Pagamento build() {
        Pagamento pagamento = new Pagamento();

        pagamento.setTipo(tipo);
        pagamento.setValor(Double.valueOf(valor));

        Venda venda = new Venda();
        venda.setId(Integer.valueOf(idVenda));
        pagamento.setVenda(venda);

        return pagamento;
    }
}
