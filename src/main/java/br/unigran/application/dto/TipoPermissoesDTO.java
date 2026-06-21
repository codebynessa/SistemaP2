/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.TipoPermissoes;

/**
 *
 * @author vanes
 */
public class TipoPermissoesDTO {

    public String nome;
    public String descricao;

    public TipoPermissoesDTO(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public TipoPermissoes build() {

        TipoPermissoes tipo = new TipoPermissoes();

        tipo.setNome(nome);
        tipo.setDescricao(descricao);

        return tipo;
    }
}
