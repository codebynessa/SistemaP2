/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import br.unigran.domain.repositories.CategoriaRepository;
import br.unigran.domain.repositories.ProdutoRepository;
import br.unigran.infra.repository.CategoriaRepositoryimpl;
import br.unigran.infra.repository.ProdutoRepositoryimpl;
import java.util.List;

/**
 *
 * @author andre
 */
public class GerenciarProdutoUC {

    ProdutoRepository repository = new ProdutoRepositoryimpl();
    CategoriaRepository categoriaRepository = new CategoriaRepositoryimpl();

    List<Categoria> categorias;

    public void cadastrarProduto(Produto produto) throws Exception {
        categorias = categoriaRepository.listarTodos();

        if (produto.getCategoria() == null) {
            throw new Exception("Categoria vazia");
        }

        if (!categorias.contains(produto.getCategoria())) {
            throw new Exception("Categoria não encontrada");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new Exception("Sem nome");
        }

        repository.salvar(produto);
    }

    public List<Produto> listarByCategoria(Categoria categoria) {
        return repository.findProdutosByCategoria(categoria);
    }
}
