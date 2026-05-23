/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.ClienteDTO;
import br.unigran.application.usecase.GerenciarClienteUC;

/**
 *
 * @author vanes
 */
public class ClienteController {
    

    static GerenciarClienteUC uc = new GerenciarClienteUC();

    public static void salvar(ClienteDTO dto) throws Exception {
        uc.salvarCliente(dto.build());
    }
}