/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.domain.repositories;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import java.util.List;

/**
 *
 * @author andre
 */
public interface ProdutoRepository extends AbstractRepository{

    public List<Produto> findProdutosByCategoria(Categoria categoria);
    
}
