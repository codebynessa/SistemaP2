/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Categoria;

/**
 *
 * @author vanes
 */
public class CategoriaDTO {
    
    public Integer id;
    public String nomeCategoria;

    public CategoriaDTO(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public CategoriaDTO(Integer id, String nomeCategoria) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria build() {

        Categoria categoria = new Categoria();

        categoria.setId(id);
        categoria.setNome(nomeCategoria);

        return categoria;
    }
}