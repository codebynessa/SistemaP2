/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import br.unigran.domain.repositories.CategoriaRepository;
import br.unigran.domain.repositories.ProdutoRepository;
import java.util.List;

/**
 *
 * @author andre
 */
public class GerenciarProdutoUC {
    ProdutoRepository repository;
    CategoriaRepository categoriaRepository;
    
    List<Categoria>categorias;
    public void cadastrarProduto(Produto produto) throws Exception{
        categorias=categoriaRepository.listarTodos();
      
        if(!categorias.contains(produto.getCategoria())){
            throw new Exception("Categora n");
        }
        if(produto.getNome().isBlank())
            throw new Exception("sem nome");
        
       repository.salvar(produto);
    }
    
    public List<Produto> listarByCategoria(Categoria categoria){
        return repository.findProdutosByCategoria(categoria);
    }
}
