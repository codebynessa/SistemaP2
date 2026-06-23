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

    public Integer id;
    public String nome;
    public String cpf;
    public String telefone;

    public ClienteDTO(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public ClienteDTO(String text) {
    }

    public ClienteDTO(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public ClienteDTO(Integer id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Cliente build() {
        Cliente c = new Cliente();
        c.setId(id);
        c.setNome(nome.trim());
        c.setCpf(cpf.trim());
        c.setTelefone(telefone.trim());

        return c;
    }
}
