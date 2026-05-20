package br.unigran.domain.repositories;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import java.util.List;

public interface ProdutoRepository extends AbstractRepository {

    public List<Produto> listarTodos();

    public List<Produto> findProdutosByCategoria(Categoria categoria);

}