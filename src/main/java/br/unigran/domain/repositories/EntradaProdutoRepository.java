/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.domain.repositories;

import br.unigran.domain.entity.EntradaProduto;
import java.util.List;

/**
 *
 * @author vanes
 */
public interface EntradaProdutoRepository extends AbstractRepository{
    public List<EntradaProduto> listarTodos();
    
}
