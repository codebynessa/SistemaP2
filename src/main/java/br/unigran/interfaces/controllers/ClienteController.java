/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.ClienteDTO;
import br.unigran.application.usecase.GerenciarClienteUC;
import br.unigran.domain.entity.Cliente;
import java.util.List;
/**
 *
 * @author vanes
 */
public class ClienteController {
    

    static GerenciarClienteUC uc = new GerenciarClienteUC();


    public static void salvar(ClienteDTO dto) throws Exception {
        uc.salvarCliente(dto.build());
    }

    public static List listarTodos() {
        return uc.listarTodos();
    }
    public static void atualizar(ClienteDTO dto) throws Exception {
    uc.atualizar(dto.build());
}public static void remover(Cliente cliente) throws Exception {
    uc.remover(cliente);
}
}