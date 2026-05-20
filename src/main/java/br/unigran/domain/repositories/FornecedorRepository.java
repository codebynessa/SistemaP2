/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.domain.repositories;

import br.unigran.domain.entity.Fornecedor;
import java.util.List;

/**
 *
 * @author vanes
 */
public interface FornecedorRepository extends AbstractRepository {
    public List<Fornecedor> listarTodos();
    
}
