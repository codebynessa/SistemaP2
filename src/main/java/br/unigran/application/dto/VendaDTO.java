/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Cliente;
import br.unigran.domain.entity.Usuario;
import br.unigran.domain.entity.Venda;
import java.util.Date;

/**
 *
 * @author vanes
 */
public class VendaDTO {
 public String valorTotal;
    public String idUsuario;
    public String idCliente;

    public VendaDTO(String valorTotal, String idUsuario, String idCliente) {
        this.valorTotal = valorTotal;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
    }

    public Venda build() {
        Venda venda = new Venda();

        venda.setDataVenda(new Date());
        venda.setValorTotal(Double.valueOf(valorTotal));

        Usuario usuario = new Usuario();
        usuario.setId(Integer.valueOf(idUsuario));
        venda.setUsuario(usuario);

        Cliente cliente = new Cliente();
        cliente.setId(Integer.valueOf(idCliente));
        venda.setCliente(cliente);

        return venda;
    }
}
