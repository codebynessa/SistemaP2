/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Cliente;

/**
 *
 * @author vanes
 */
public class ClienteDTO {
    
    public String nome;
    public String telefone;

    public Cliente build() {
        Cliente c = new Cliente();

        c.setNome(nome);
        c.setTelefone(telefone);

        return c;
    }
}