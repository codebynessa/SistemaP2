/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.infra.repository;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import br.unigran.domain.repositories.ProdutoRepository;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

/**
 *
 * @author vanes
 */

public class ProdutoRepositoryimpl implements ProdutoRepository {
  JPAUtil dao = JPAUtil.getInstace();

    @Override
    public void salvar(Object produto) {
        dao.salvar(produto);
    }

    @Override
    public List<Produto> listarTodos() {
        return dao.listar("From Produto", null);
    }

    @Override
    public List<Produto> findProdutosByCategoria(Categoria categoria) {
        return dao.listar(
                "From Produto p where p.categoria = ?0",
                new String[]{String.valueOf(categoria.getId())}
        );
    }

    @Override
    public void remover(Object o) {
        dao.remover(o);
    }

    @Override
    public List listar(String quere, String[] parametros) {
        return dao.listar(quere, parametros);
    }

    @Override
    public Object findByID(Integer id) {
        return dao.findById(id, Produto.class);
    }
}