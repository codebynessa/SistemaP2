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
    
    public String nomeCategoria;

    public CategoriaDTO(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria build() {

        Categoria categoria = new Categoria();

        categoria.setNome(nomeCategoria);

        return categoria;
    }
}