/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.domain.repositories;

import br.unigran.domain.entity.TipoPermissoes;
import java.util.List;

/**
 *
 * @author vanes
 */
public interface TipoPermissoesRepository extends AbstractRepository{
    public List<TipoPermissoes> listarTodos();
    
}
