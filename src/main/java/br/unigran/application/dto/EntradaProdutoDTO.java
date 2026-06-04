/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.EntradaProduto;
import br.unigran.domain.entity.Fornecedor;
import br.unigran.domain.entity.Usuario;
import java.util.Date;

/**
 *
 * @author vanes
 */
public class EntradaProdutoDTO {
    public String valorTotal;
    public String idFornecedor;
    public String idUsuario;

    public EntradaProdutoDTO(String valorTotal, String idFornecedor, String idUsuario) {
        this.valorTotal = valorTotal;
        this.idFornecedor = idFornecedor;
        this.idUsuario = idUsuario;
    }

    public EntradaProduto build() {
        EntradaProduto entrada = new EntradaProduto();

        entrada.setDataEntrada(new Date());
        entrada.setValorTotal(Double.valueOf(valorTotal));

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId(Integer.valueOf(idFornecedor));
        entrada.setFornecedor(fornecedor);

        Usuario usuario = new Usuario();
        usuario.setId(Integer.valueOf(idUsuario));
        entrada.setUsuario(usuario);

        return entrada;
    }
}